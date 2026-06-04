// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMobileAgentPackageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PackageList")
    public java.util.List<DescribeMobileAgentPackageResponseBodyPackageList> packageList;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeMobileAgentPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMobileAgentPackageResponseBody self = new DescribeMobileAgentPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMobileAgentPackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMobileAgentPackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMobileAgentPackageResponseBody setPackageList(java.util.List<DescribeMobileAgentPackageResponseBodyPackageList> packageList) {
        this.packageList = packageList;
        return this;
    }
    public java.util.List<DescribeMobileAgentPackageResponseBodyPackageList> getPackageList() {
        return this.packageList;
    }

    public DescribeMobileAgentPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMobileAgentPackageResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMobileAgentPackageResponseBodyPackageList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-10-30 00:00:00</p>
         */
        @NameInMap("ExpiredAt")
        public String expiredAt;

        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <strong>example:</strong>
         * <p>8000</p>
         */
        @NameInMap("PackageCredit")
        public String packageCredit;

        /**
         * <strong>example:</strong>
         * <p>cmag-bp19i1yxu60r7twy****</p>
         */
        @NameInMap("PackageId")
        public String packageId;

        /**
         * <strong>example:</strong>
         * <p>advanced</p>
         */
        @NameInMap("PackageSpec")
        public String packageSpec;

        @NameInMap("PackageSpecName")
        public String packageSpecName;

        /**
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("PackageStatus")
        public String packageStatus;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("UsedCredit")
        public String usedCredit;

        public static DescribeMobileAgentPackageResponseBodyPackageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMobileAgentPackageResponseBodyPackageList self = new DescribeMobileAgentPackageResponseBodyPackageList();
            return TeaModel.build(map, self);
        }

        public DescribeMobileAgentPackageResponseBodyPackageList setExpiredAt(String expiredAt) {
            this.expiredAt = expiredAt;
            return this;
        }
        public String getExpiredAt() {
            return this.expiredAt;
        }

        public DescribeMobileAgentPackageResponseBodyPackageList setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public DescribeMobileAgentPackageResponseBodyPackageList setPackageCredit(String packageCredit) {
            this.packageCredit = packageCredit;
            return this;
        }
        public String getPackageCredit() {
            return this.packageCredit;
        }

        public DescribeMobileAgentPackageResponseBodyPackageList setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

        public DescribeMobileAgentPackageResponseBodyPackageList setPackageSpec(String packageSpec) {
            this.packageSpec = packageSpec;
            return this;
        }
        public String getPackageSpec() {
            return this.packageSpec;
        }

        public DescribeMobileAgentPackageResponseBodyPackageList setPackageSpecName(String packageSpecName) {
            this.packageSpecName = packageSpecName;
            return this;
        }
        public String getPackageSpecName() {
            return this.packageSpecName;
        }

        public DescribeMobileAgentPackageResponseBodyPackageList setPackageStatus(String packageStatus) {
            this.packageStatus = packageStatus;
            return this;
        }
        public String getPackageStatus() {
            return this.packageStatus;
        }

        public DescribeMobileAgentPackageResponseBodyPackageList setUsedCredit(String usedCredit) {
            this.usedCredit = usedCredit;
            return this;
        }
        public String getUsedCredit() {
            return this.usedCredit;
        }

    }

}
