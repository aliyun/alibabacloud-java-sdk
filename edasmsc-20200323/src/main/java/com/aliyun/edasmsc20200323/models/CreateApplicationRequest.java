// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("Region")
    @Validation(required = true)
    public String region;

    @NameInMap("Source")
    public String source;

    @NameInMap("Language")
    public String language;

    @NameInMap("ExtraInfo")
    public String extraInfo;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

}
