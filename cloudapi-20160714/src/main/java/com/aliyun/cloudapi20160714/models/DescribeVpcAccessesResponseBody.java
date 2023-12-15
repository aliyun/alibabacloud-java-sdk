// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeVpcAccessesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VpcAccessAttributes")
    public DescribeVpcAccessesResponseBodyVpcAccessAttributes vpcAccessAttributes;

    public static DescribeVpcAccessesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcAccessesResponseBody self = new DescribeVpcAccessesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcAccessesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpcAccessesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcAccessesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcAccessesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpcAccessesResponseBody setVpcAccessAttributes(DescribeVpcAccessesResponseBodyVpcAccessAttributes vpcAccessAttributes) {
        this.vpcAccessAttributes = vpcAccessAttributes;
        return this;
    }
    public DescribeVpcAccessesResponseBodyVpcAccessAttributes getVpcAccessAttributes() {
        return this.vpcAccessAttributes;
    }

    public static class DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTagsTagInfo extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTagsTagInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTagsTagInfo self = new DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTagsTagInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTagsTagInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTagsTagInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTags extends TeaModel {
        @NameInMap("TagInfo")
        public java.util.List<DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTagsTagInfo> tagInfo;

        public static DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTags self = new DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTags();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTags setTagInfo(java.util.List<DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTagsTagInfo> tagInfo) {
            this.tagInfo = tagInfo;
            return this;
        }
        public java.util.List<DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTagsTagInfo> getTagInfo() {
            return this.tagInfo;
        }

    }

    public static class DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Tags")
        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTags tags;

        @NameInMap("VpcAccessId")
        public String vpcAccessId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcTargetHostName")
        public String vpcTargetHostName;

        public static DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute self = new DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setTags(DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttributeTags getTags() {
            return this.tags;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setVpcAccessId(String vpcAccessId) {
            this.vpcAccessId = vpcAccessId;
            return this;
        }
        public String getVpcAccessId() {
            return this.vpcAccessId;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute setVpcTargetHostName(String vpcTargetHostName) {
            this.vpcTargetHostName = vpcTargetHostName;
            return this;
        }
        public String getVpcTargetHostName() {
            return this.vpcTargetHostName;
        }

    }

    public static class DescribeVpcAccessesResponseBodyVpcAccessAttributes extends TeaModel {
        @NameInMap("VpcAccessAttribute")
        public java.util.List<DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute> vpcAccessAttribute;

        public static DescribeVpcAccessesResponseBodyVpcAccessAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAccessesResponseBodyVpcAccessAttributes self = new DescribeVpcAccessesResponseBodyVpcAccessAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAccessesResponseBodyVpcAccessAttributes setVpcAccessAttribute(java.util.List<DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute> vpcAccessAttribute) {
            this.vpcAccessAttribute = vpcAccessAttribute;
            return this;
        }
        public java.util.List<DescribeVpcAccessesResponseBodyVpcAccessAttributesVpcAccessAttribute> getVpcAccessAttribute() {
            return this.vpcAccessAttribute;
        }

    }

}
