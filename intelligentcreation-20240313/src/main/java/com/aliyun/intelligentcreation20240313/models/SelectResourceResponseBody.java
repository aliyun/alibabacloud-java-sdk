// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SelectResourceResponseBody extends TeaModel {
    @NameInMap("aliyunUid")
    public String aliyunUid;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resourceInfoList")
    public java.util.List<SelectResourceResponseBodyResourceInfoList> resourceInfoList;

    public static SelectResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SelectResourceResponseBody self = new SelectResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public SelectResourceResponseBody setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
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
        @NameInMap("expireTime")
        public String expireTime;

        @NameInMap("lastExpire")
        public Integer lastExpire;

        @NameInMap("remainCount")
        public Integer remainCount;

        @NameInMap("resourceType")
        public Integer resourceType;

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
