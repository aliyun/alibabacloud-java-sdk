// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListEnterprisePausesResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkListEnterprisePausesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7BF47617-7851-48F7-A3A1-2021342A78E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkListEnterprisePausesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkListEnterprisePausesResponseBody self = new ClinkListEnterprisePausesResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkListEnterprisePausesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkListEnterprisePausesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkListEnterprisePausesResponseBody setData(ClinkListEnterprisePausesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkListEnterprisePausesResponseBodyData getData() {
        return this.data;
    }

    public ClinkListEnterprisePausesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkListEnterprisePausesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkListEnterprisePausesResponseBodyDataEnterprisePauses extends TeaModel {
        /**
         * <p>置忙状态Id</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>默认状态，0：不是；1：是</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsDefault")
        public Long isDefault;

        /**
         * <p>休息状态，0：不是；1：是</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsRest")
        public String isRest;

        /**
         * <p>置忙状态描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("PauseStatus")
        public String pauseStatus;

        /**
         * <p>优先级，数字越小优先级越高</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Sort")
        public Long sort;

        public static ClinkListEnterprisePausesResponseBodyDataEnterprisePauses build(java.util.Map<String, ?> map) throws Exception {
            ClinkListEnterprisePausesResponseBodyDataEnterprisePauses self = new ClinkListEnterprisePausesResponseBodyDataEnterprisePauses();
            return TeaModel.build(map, self);
        }

        public ClinkListEnterprisePausesResponseBodyDataEnterprisePauses setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ClinkListEnterprisePausesResponseBodyDataEnterprisePauses setIsDefault(Long isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Long getIsDefault() {
            return this.isDefault;
        }

        public ClinkListEnterprisePausesResponseBodyDataEnterprisePauses setIsRest(String isRest) {
            this.isRest = isRest;
            return this;
        }
        public String getIsRest() {
            return this.isRest;
        }

        public ClinkListEnterprisePausesResponseBodyDataEnterprisePauses setPauseStatus(String pauseStatus) {
            this.pauseStatus = pauseStatus;
            return this;
        }
        public String getPauseStatus() {
            return this.pauseStatus;
        }

        public ClinkListEnterprisePausesResponseBodyDataEnterprisePauses setSort(Long sort) {
            this.sort = sort;
            return this;
        }
        public Long getSort() {
            return this.sort;
        }

    }

    public static class ClinkListEnterprisePausesResponseBodyData extends TeaModel {
        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        /**
         * <p>企业置忙状态列表</p>
         */
        @NameInMap("EnterprisePauses")
        public java.util.List<ClinkListEnterprisePausesResponseBodyDataEnterprisePauses> enterprisePauses;

        public static ClinkListEnterprisePausesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkListEnterprisePausesResponseBodyData self = new ClinkListEnterprisePausesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkListEnterprisePausesResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkListEnterprisePausesResponseBodyData setEnterprisePauses(java.util.List<ClinkListEnterprisePausesResponseBodyDataEnterprisePauses> enterprisePauses) {
            this.enterprisePauses = enterprisePauses;
            return this;
        }
        public java.util.List<ClinkListEnterprisePausesResponseBodyDataEnterprisePauses> getEnterprisePauses() {
            return this.enterprisePauses;
        }

    }

}
