// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeCustomizedFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CustomizedFilter")
    public DescribeCustomizedFilterResponseBodyCustomizedFilter customizedFilter;

    public static DescribeCustomizedFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizedFilterResponseBody self = new DescribeCustomizedFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizedFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomizedFilterResponseBody setCustomizedFilter(DescribeCustomizedFilterResponseBodyCustomizedFilter customizedFilter) {
        this.customizedFilter = customizedFilter;
        return this;
    }
    public DescribeCustomizedFilterResponseBodyCustomizedFilter getCustomizedFilter() {
        return this.customizedFilter;
    }

    public static class DescribeCustomizedFilterResponseBodyCustomizedFilter extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("VersionType")
        public String versionType;

        @NameInMap("VersionId")
        public Long versionId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValueCompareType")
        public String valueCompareType;

        @NameInMap("BlackWhiteType")
        public String blackWhiteType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("ValueType")
        public String valueType;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifyTimestamp")
        public Long gmtModifyTimestamp;

        public static DescribeCustomizedFilterResponseBodyCustomizedFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomizedFilterResponseBodyCustomizedFilter self = new DescribeCustomizedFilterResponseBodyCustomizedFilter();
            return TeaModel.build(map, self);
        }

        public DescribeCustomizedFilterResponseBodyCustomizedFilter setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCustomizedFilterResponseBodyCustomizedFilter setVersionType(String versionType) {
            this.versionType = versionType;
            return this;
        }
        public String getVersionType() {
            return this.versionType;
        }

        public DescribeCustomizedFilterResponseBodyCustomizedFilter setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

        public DescribeCustomizedFilterResponseBodyCustomizedFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustomizedFilterResponseBodyCustomizedFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeCustomizedFilterResponseBodyCustomizedFilter setValueCompareType(String valueCompareType) {
            this.valueCompareType = valueCompareType;
            return this;
        }
        public String getValueCompareType() {
            return this.valueCompareType;
        }

        public DescribeCustomizedFilterResponseBodyCustomizedFilter setBlackWhiteType(String blackWhiteType) {
            this.blackWhiteType = blackWhiteType;
            return this;
        }
        public String getBlackWhiteType() {
            return this.blackWhiteType;
        }

        public DescribeCustomizedFilterResponseBodyCustomizedFilter setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeCustomizedFilterResponseBodyCustomizedFilter setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public DescribeCustomizedFilterResponseBodyCustomizedFilter setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

        public DescribeCustomizedFilterResponseBodyCustomizedFilter setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public DescribeCustomizedFilterResponseBodyCustomizedFilter setGmtModifyTimestamp(Long gmtModifyTimestamp) {
            this.gmtModifyTimestamp = gmtModifyTimestamp;
            return this;
        }
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
        }

    }

}
