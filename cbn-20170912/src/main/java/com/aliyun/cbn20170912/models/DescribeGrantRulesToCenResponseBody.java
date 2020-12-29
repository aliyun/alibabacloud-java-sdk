// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesToCenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GrantRules")
    public java.util.List<DescribeGrantRulesToCenResponseBodyGrantRules> grantRules;

    public static DescribeGrantRulesToCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantRulesToCenResponseBody self = new DescribeGrantRulesToCenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGrantRulesToCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGrantRulesToCenResponseBody setGrantRules(java.util.List<DescribeGrantRulesToCenResponseBodyGrantRules> grantRules) {
        this.grantRules = grantRules;
        return this;
    }
    public java.util.List<DescribeGrantRulesToCenResponseBodyGrantRules> getGrantRules() {
        return this.grantRules;
    }

    public static class DescribeGrantRulesToCenResponseBodyGrantRules extends TeaModel {
        @NameInMap("ChildInstanceType")
        public String childInstanceType;

        @NameInMap("ChildInstanceRegionId")
        public String childInstanceRegionId;

        @NameInMap("ChildInstanceOwnerId")
        public Long childInstanceOwnerId;

        @NameInMap("ChildInstanceId")
        public String childInstanceId;

        @NameInMap("CenId")
        public String cenId;

        public static DescribeGrantRulesToCenResponseBodyGrantRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantRulesToCenResponseBodyGrantRules self = new DescribeGrantRulesToCenResponseBodyGrantRules();
            return TeaModel.build(map, self);
        }

        public DescribeGrantRulesToCenResponseBodyGrantRules setChildInstanceType(String childInstanceType) {
            this.childInstanceType = childInstanceType;
            return this;
        }
        public String getChildInstanceType() {
            return this.childInstanceType;
        }

        public DescribeGrantRulesToCenResponseBodyGrantRules setChildInstanceRegionId(String childInstanceRegionId) {
            this.childInstanceRegionId = childInstanceRegionId;
            return this;
        }
        public String getChildInstanceRegionId() {
            return this.childInstanceRegionId;
        }

        public DescribeGrantRulesToCenResponseBodyGrantRules setChildInstanceOwnerId(Long childInstanceOwnerId) {
            this.childInstanceOwnerId = childInstanceOwnerId;
            return this;
        }
        public Long getChildInstanceOwnerId() {
            return this.childInstanceOwnerId;
        }

        public DescribeGrantRulesToCenResponseBodyGrantRules setChildInstanceId(String childInstanceId) {
            this.childInstanceId = childInstanceId;
            return this;
        }
        public String getChildInstanceId() {
            return this.childInstanceId;
        }

        public DescribeGrantRulesToCenResponseBodyGrantRules setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

    }

}
