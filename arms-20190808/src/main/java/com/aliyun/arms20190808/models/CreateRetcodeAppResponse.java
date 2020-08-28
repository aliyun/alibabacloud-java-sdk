// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateRetcodeAppResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RetcodeAppDataBean")
    @Validation(required = true)
    public CreateRetcodeAppResponseRetcodeAppDataBean retcodeAppDataBean;

    public static CreateRetcodeAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRetcodeAppResponse self = new CreateRetcodeAppResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateRetcodeAppResponseRetcodeAppDataBean extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public Long appId;

        @NameInMap("Pid")
        @Validation(required = true)
        public String pid;

        public static CreateRetcodeAppResponseRetcodeAppDataBean build(java.util.Map<String, ?> map) throws Exception {
            CreateRetcodeAppResponseRetcodeAppDataBean self = new CreateRetcodeAppResponseRetcodeAppDataBean();
            return TeaModel.build(map, self);
        }

    }

}
