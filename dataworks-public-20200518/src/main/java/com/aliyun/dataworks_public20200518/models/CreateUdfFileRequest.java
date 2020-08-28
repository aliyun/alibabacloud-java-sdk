// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateUdfFileRequest extends TeaModel {
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("FileName")
    @Validation(required = true)
    public String fileName;

    @NameInMap("FunctionType")
    @Validation(required = true)
    public String functionType;

    @NameInMap("ClassName")
    @Validation(required = true)
    public String className;

    @NameInMap("Resources")
    @Validation(required = true)
    public String resources;

    @NameInMap("UdfDescription")
    public String udfDescription;

    @NameInMap("CmdDescription")
    public String cmdDescription;

    @NameInMap("ParameterDescription")
    public String parameterDescription;

    @NameInMap("ReturnValue")
    public String returnValue;

    @NameInMap("Example")
    public String example;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static CreateUdfFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUdfFileRequest self = new CreateUdfFileRequest();
        return TeaModel.build(map, self);
    }

}
