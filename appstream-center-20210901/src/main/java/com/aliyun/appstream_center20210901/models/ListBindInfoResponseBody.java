// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListBindInfoResponseBody extends TeaModel {
    @NameInMap("BindInfoModels")
    public java.util.List<ListBindInfoResponseBodyBindInfoModels> bindInfoModels;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>AD2D0761-1FE5-549D-B169-D3F8D19C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBindInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBindInfoResponseBody self = new ListBindInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBindInfoResponseBody setBindInfoModels(java.util.List<ListBindInfoResponseBodyBindInfoModels> bindInfoModels) {
        this.bindInfoModels = bindInfoModels;
        return this;
    }
    public java.util.List<ListBindInfoResponseBodyBindInfoModels> getBindInfoModels() {
        return this.bindInfoModels;
    }

    public ListBindInfoResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBindInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBindInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBindInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBindInfoResponseBodyBindInfoModels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>simple</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <strong>example:</strong>
         * <p>ca-fq738or6vd854****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>aig-0abxhr6ce35w8****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <strong>example:</strong>
         * <p>ai-83oe276fre4l3****</p>
         */
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>2ca6f5a93536****</p>
         */
        @NameInMap("WyId")
        public String wyId;

        public static ListBindInfoResponseBodyBindInfoModels build(java.util.Map<String, ?> map) throws Exception {
            ListBindInfoResponseBodyBindInfoModels self = new ListBindInfoResponseBodyBindInfoModels();
            return TeaModel.build(map, self);
        }

        public ListBindInfoResponseBodyBindInfoModels setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListBindInfoResponseBodyBindInfoModels setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListBindInfoResponseBodyBindInfoModels setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public ListBindInfoResponseBodyBindInfoModels setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public ListBindInfoResponseBodyBindInfoModels setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListBindInfoResponseBodyBindInfoModels setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListBindInfoResponseBodyBindInfoModels setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListBindInfoResponseBodyBindInfoModels setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListBindInfoResponseBodyBindInfoModels setWyId(String wyId) {
            this.wyId = wyId;
            return this;
        }
        public String getWyId() {
            return this.wyId;
        }

    }

}
