// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationResponseBody extends TeaModel {
    @NameInMap("DstList")
    public java.util.List<DescribeOutgoingDestinationResponseBodyDstList> dstList;

    /**
     * <strong>example:</strong>
     * <p>A2845BA9-1642-5B27-9F04-8014DD94****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOutgoingDestinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDestinationResponseBody self = new DescribeOutgoingDestinationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDestinationResponseBody setDstList(java.util.List<DescribeOutgoingDestinationResponseBodyDstList> dstList) {
        this.dstList = dstList;
        return this;
    }
    public java.util.List<DescribeOutgoingDestinationResponseBodyDstList> getDstList() {
        return this.dstList;
    }

    public DescribeOutgoingDestinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOutgoingDestinationResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOutgoingDestinationResponseBodyDstListTagList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagDescribe")
        public String tagDescribe;

        /**
         * <strong>example:</strong>
         * <p>FirstFlow</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <strong>example:</strong>
         * <p>verify</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static DescribeOutgoingDestinationResponseBodyDstListTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDestinationResponseBodyDstListTagList self = new DescribeOutgoingDestinationResponseBodyDstListTagList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDestinationResponseBodyDstListTagList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeOutgoingDestinationResponseBodyDstListTagList setTagDescribe(String tagDescribe) {
            this.tagDescribe = tagDescribe;
            return this;
        }
        public String getTagDescribe() {
            return this.tagDescribe;
        }

        public DescribeOutgoingDestinationResponseBodyDstListTagList setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public DescribeOutgoingDestinationResponseBodyDstListTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class DescribeOutgoingDestinationResponseBodyDstList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AclRecommendDetail")
        public String aclRecommendDetail;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Business")
        public String business;

        /**
         * <strong>example:</strong>
         * <p>AliYun</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <strong>example:</strong>
         * <p>categor_test</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DstDomain")
        public String dstDomain;

        /**
         * <strong>example:</strong>
         * <p>101.6.15.XXX</p>
         */
        @NameInMap("DstIP")
        public String dstIP;

        /**
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("DstType")
        public String dstType;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasAclRecommend")
        public Boolean hasAclRecommend;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsMarkNormal")
        public Boolean isMarkNormal;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        @NameInMap("TagList")
        public java.util.List<DescribeOutgoingDestinationResponseBodyDstListTagList> tagList;

        public static DescribeOutgoingDestinationResponseBodyDstList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDestinationResponseBodyDstList self = new DescribeOutgoingDestinationResponseBodyDstList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDestinationResponseBodyDstList setAclRecommendDetail(String aclRecommendDetail) {
            this.aclRecommendDetail = aclRecommendDetail;
            return this;
        }
        public String getAclRecommendDetail() {
            return this.aclRecommendDetail;
        }

        public DescribeOutgoingDestinationResponseBodyDstList setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

        public DescribeOutgoingDestinationResponseBodyDstList setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public DescribeOutgoingDestinationResponseBodyDstList setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public DescribeOutgoingDestinationResponseBodyDstList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeOutgoingDestinationResponseBodyDstList setDstDomain(String dstDomain) {
            this.dstDomain = dstDomain;
            return this;
        }
        public String getDstDomain() {
            return this.dstDomain;
        }

        public DescribeOutgoingDestinationResponseBodyDstList setDstIP(String dstIP) {
            this.dstIP = dstIP;
            return this;
        }
        public String getDstIP() {
            return this.dstIP;
        }

        public DescribeOutgoingDestinationResponseBodyDstList setDstType(String dstType) {
            this.dstType = dstType;
            return this;
        }
        public String getDstType() {
            return this.dstType;
        }

        public DescribeOutgoingDestinationResponseBodyDstList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeOutgoingDestinationResponseBodyDstList setHasAclRecommend(Boolean hasAclRecommend) {
            this.hasAclRecommend = hasAclRecommend;
            return this;
        }
        public Boolean getHasAclRecommend() {
            return this.hasAclRecommend;
        }

        public DescribeOutgoingDestinationResponseBodyDstList setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribeOutgoingDestinationResponseBodyDstList setIsMarkNormal(Boolean isMarkNormal) {
            this.isMarkNormal = isMarkNormal;
            return this;
        }
        public Boolean getIsMarkNormal() {
            return this.isMarkNormal;
        }

        public DescribeOutgoingDestinationResponseBodyDstList setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeOutgoingDestinationResponseBodyDstList setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeOutgoingDestinationResponseBodyDstList setTagList(java.util.List<DescribeOutgoingDestinationResponseBodyDstListTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeOutgoingDestinationResponseBodyDstListTagList> getTagList() {
            return this.tagList;
        }

    }

}
