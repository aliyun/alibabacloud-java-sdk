// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateTenantApplicationResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public CreateTenantApplicationResponseBodyData data;

    /**
     * <p>id of the req</p>
     * 
     * <strong>example:</strong>
     * <p>10REQUES-AC5C-4B59-BE11-378F117A6A88</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateTenantApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantApplicationResponseBody self = new CreateTenantApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTenantApplicationResponseBody setData(CreateTenantApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTenantApplicationResponseBodyData getData() {
        return this.data;
    }

    public CreateTenantApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateTenantApplicationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxx">http://xxxx</a></p>
         */
        @NameInMap("openUrl")
        public String openUrl;

        /**
         * <strong>example:</strong>
         * <p>OPENED 已开通 OPENING 开通中</p>
         */
        @NameInMap("progress")
        public String progress;

        public static CreateTenantApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTenantApplicationResponseBodyData self = new CreateTenantApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTenantApplicationResponseBodyData setOpenUrl(String openUrl) {
            this.openUrl = openUrl;
            return this;
        }
        public String getOpenUrl() {
            return this.openUrl;
        }

        public CreateTenantApplicationResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

}
