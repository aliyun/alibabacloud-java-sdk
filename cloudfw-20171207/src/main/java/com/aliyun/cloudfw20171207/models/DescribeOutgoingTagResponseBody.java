// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingTagResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B532203E-813B-5BEB-B75B-315E1D08****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagList")
    public java.util.List<DescribeOutgoingTagResponseBodyTagList> tagList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOutgoingTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingTagResponseBody self = new DescribeOutgoingTagResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOutgoingTagResponseBody setTagList(java.util.List<DescribeOutgoingTagResponseBodyTagList> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<DescribeOutgoingTagResponseBodyTagList> getTagList() {
        return this.tagList;
    }

    public DescribeOutgoingTagResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOutgoingTagResponseBodyTagList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Trusted</p>
         */
        @NameInMap("ClassId")
        public String classId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <strong>example:</strong>
         * <p>test describe</p>
         */
        @NameInMap("TagDescribe")
        public String tagDescribe;

        /**
         * <strong>example:</strong>
         * <p>tag-6833388d18cc****</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <strong>example:</strong>
         * <p>test tag</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static DescribeOutgoingTagResponseBodyTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingTagResponseBodyTagList self = new DescribeOutgoingTagResponseBodyTagList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingTagResponseBodyTagList setClassId(String classId) {
            this.classId = classId;
            return this;
        }
        public String getClassId() {
            return this.classId;
        }

        public DescribeOutgoingTagResponseBodyTagList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeOutgoingTagResponseBodyTagList setTagDescribe(String tagDescribe) {
            this.tagDescribe = tagDescribe;
            return this;
        }
        public String getTagDescribe() {
            return this.tagDescribe;
        }

        public DescribeOutgoingTagResponseBodyTagList setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public DescribeOutgoingTagResponseBodyTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
