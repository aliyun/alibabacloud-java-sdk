// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateRetcodeAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RetcodeAppDataBean")
    public CreateRetcodeAppResponseBodyRetcodeAppDataBean retcodeAppDataBean;

    public static CreateRetcodeAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRetcodeAppResponseBody self = new CreateRetcodeAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRetcodeAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRetcodeAppResponseBody setRetcodeAppDataBean(CreateRetcodeAppResponseBodyRetcodeAppDataBean retcodeAppDataBean) {
        this.retcodeAppDataBean = retcodeAppDataBean;
        return this;
    }
    public CreateRetcodeAppResponseBodyRetcodeAppDataBean getRetcodeAppDataBean() {
        return this.retcodeAppDataBean;
    }

    public static class CreateRetcodeAppResponseBodyRetcodeAppDataBean extends TeaModel {
        @NameInMap("Pid")
        public String pid;

        @NameInMap("AppId")
        public Long appId;

        public static CreateRetcodeAppResponseBodyRetcodeAppDataBean build(java.util.Map<String, ?> map) throws Exception {
            CreateRetcodeAppResponseBodyRetcodeAppDataBean self = new CreateRetcodeAppResponseBodyRetcodeAppDataBean();
            return TeaModel.build(map, self);
        }

        public CreateRetcodeAppResponseBodyRetcodeAppDataBean setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public CreateRetcodeAppResponseBodyRetcodeAppDataBean setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

    }

}
