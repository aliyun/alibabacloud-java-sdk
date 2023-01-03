// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateRetcodeAppResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The information of the browser monitoring task.
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

    public static class CreateRetcodeAppResponseBodyRetcodeAppDataBeanTagsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateRetcodeAppResponseBodyRetcodeAppDataBeanTagsTags build(java.util.Map<String, ?> map) throws Exception {
            CreateRetcodeAppResponseBodyRetcodeAppDataBeanTagsTags self = new CreateRetcodeAppResponseBodyRetcodeAppDataBeanTagsTags();
            return TeaModel.build(map, self);
        }

        public CreateRetcodeAppResponseBodyRetcodeAppDataBeanTagsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRetcodeAppResponseBodyRetcodeAppDataBeanTagsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateRetcodeAppResponseBodyRetcodeAppDataBeanTags extends TeaModel {
        @NameInMap("Tags")
        public java.util.List<CreateRetcodeAppResponseBodyRetcodeAppDataBeanTagsTags> tags;

        public static CreateRetcodeAppResponseBodyRetcodeAppDataBeanTags build(java.util.Map<String, ?> map) throws Exception {
            CreateRetcodeAppResponseBodyRetcodeAppDataBeanTags self = new CreateRetcodeAppResponseBodyRetcodeAppDataBeanTags();
            return TeaModel.build(map, self);
        }

        public CreateRetcodeAppResponseBodyRetcodeAppDataBeanTags setTags(java.util.List<CreateRetcodeAppResponseBodyRetcodeAppDataBeanTagsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<CreateRetcodeAppResponseBodyRetcodeAppDataBeanTagsTags> getTags() {
            return this.tags;
        }

    }

    public static class CreateRetcodeAppResponseBodyRetcodeAppDataBean extends TeaModel {
        // The ID of the application.
        @NameInMap("AppId")
        public Long appId;

        // PID。
        @NameInMap("Pid")
        public String pid;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public CreateRetcodeAppResponseBodyRetcodeAppDataBeanTags tags;

        public static CreateRetcodeAppResponseBodyRetcodeAppDataBean build(java.util.Map<String, ?> map) throws Exception {
            CreateRetcodeAppResponseBodyRetcodeAppDataBean self = new CreateRetcodeAppResponseBodyRetcodeAppDataBean();
            return TeaModel.build(map, self);
        }

        public CreateRetcodeAppResponseBodyRetcodeAppDataBean setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public CreateRetcodeAppResponseBodyRetcodeAppDataBean setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public CreateRetcodeAppResponseBodyRetcodeAppDataBean setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateRetcodeAppResponseBodyRetcodeAppDataBean setTags(CreateRetcodeAppResponseBodyRetcodeAppDataBeanTags tags) {
            this.tags = tags;
            return this;
        }
        public CreateRetcodeAppResponseBodyRetcodeAppDataBeanTags getTags() {
            return this.tags;
        }

    }

}
