// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateUdfFileRequest extends TeaModel {
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    @NameInMap("ProjectId")
    public Long projectId;

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

    @NameInMap("FileId")
    @Validation(required = true)
    public String fileId;

    public static UpdateUdfFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUdfFileRequest self = new UpdateUdfFileRequest();
        return TeaModel.build(map, self);
    }

}
