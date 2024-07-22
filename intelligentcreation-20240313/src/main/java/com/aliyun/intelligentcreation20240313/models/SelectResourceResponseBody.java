// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SelectResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0E8B1746-AE35-5C4B-A3A8-345B274AE32C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resourceInfoList")
    public java.util.List<SelectResourceResponseBodyResourceInfoList> resourceInfoList;

    public static SelectResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SelectResourceResponseBody self = new SelectResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public SelectResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SelectResourceResponseBody setResourceInfoList(java.util.List<SelectResourceResponseBodyResourceInfoList> resourceInfoList) {
        this.resourceInfoList = resourceInfoList;
        return this;
    }
    public java.util.List<SelectResourceResponseBodyResourceInfoList> getResourceInfoList() {
        return this.resourceInfoList;
    }

    public static class SelectResourceResponseBodyResourceInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("lastExpire")
        public Integer lastExpire;

        /**
         * <strong>example:</strong>
         * <p>1249</p>
         */
        @NameInMap("remainCount")
        public Integer remainCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("resourceType")
        public Integer resourceType;

        /**
         * <strong>example:</strong>
         * <p>second</p>
         */
        @NameInMap("unit")
        public String unit;

        public static SelectResourceResponseBodyResourceInfoList build(java.util.Map<String, ?> map) throws Exception {
            SelectResourceResponseBodyResourceInfoList self = new SelectResourceResponseBodyResourceInfoList();
            return TeaModel.build(map, self);
        }

        public SelectResourceResponseBodyResourceInfoList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public SelectResourceResponseBodyResourceInfoList setLastExpire(Integer lastExpire) {
            this.lastExpire = lastExpire;
            return this;
        }
        public Integer getLastExpire() {
            return this.lastExpire;
        }

        public SelectResourceResponseBodyResourceInfoList setRemainCount(Integer remainCount) {
            this.remainCount = remainCount;
            return this;
        }
        public Integer getRemainCount() {
            return this.remainCount;
        }

        public SelectResourceResponseBodyResourceInfoList setResourceType(Integer resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Integer getResourceType() {
            return this.resourceType;
        }

        public SelectResourceResponseBodyResourceInfoList setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
