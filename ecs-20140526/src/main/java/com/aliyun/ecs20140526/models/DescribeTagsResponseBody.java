// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTagsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public DescribeTagsResponseBodyTags tags;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsResponseBody self = new DescribeTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTagsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagsResponseBody setTags(DescribeTagsResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeTagsResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeTagsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTagsResponseBodyTagsTagResourceTypeCount extends TeaModel {
        @NameInMap("Ddh")
        public Integer ddh;

        @NameInMap("Disk")
        public Integer disk;

        @NameInMap("Eni")
        public Integer eni;

        @NameInMap("Image")
        public Integer image;

        @NameInMap("Instance")
        public Integer instance;

        @NameInMap("KeyPair")
        public Integer keyPair;

        @NameInMap("LaunchTemplate")
        public Integer launchTemplate;

        @NameInMap("ReservedInstance")
        public Integer reservedInstance;

        @NameInMap("Securitygroup")
        public Integer securitygroup;

        @NameInMap("Snapshot")
        public Integer snapshot;

        @NameInMap("SnapshotPolicy")
        public Integer snapshotPolicy;

        @NameInMap("Volume")
        public Integer volume;

        public static DescribeTagsResponseBodyTagsTagResourceTypeCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyTagsTagResourceTypeCount self = new DescribeTagsResponseBodyTagsTagResourceTypeCount();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyTagsTagResourceTypeCount setDdh(Integer ddh) {
            this.ddh = ddh;
            return this;
        }
        public Integer getDdh() {
            return this.ddh;
        }

        public DescribeTagsResponseBodyTagsTagResourceTypeCount setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeTagsResponseBodyTagsTagResourceTypeCount setEni(Integer eni) {
            this.eni = eni;
            return this;
        }
        public Integer getEni() {
            return this.eni;
        }

        public DescribeTagsResponseBodyTagsTagResourceTypeCount setImage(Integer image) {
            this.image = image;
            return this;
        }
        public Integer getImage() {
            return this.image;
        }

        public DescribeTagsResponseBodyTagsTagResourceTypeCount setInstance(Integer instance) {
            this.instance = instance;
            return this;
        }
        public Integer getInstance() {
            return this.instance;
        }

        public DescribeTagsResponseBodyTagsTagResourceTypeCount setKeyPair(Integer keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public Integer getKeyPair() {
            return this.keyPair;
        }

        public DescribeTagsResponseBodyTagsTagResourceTypeCount setLaunchTemplate(Integer launchTemplate) {
            this.launchTemplate = launchTemplate;
            return this;
        }
        public Integer getLaunchTemplate() {
            return this.launchTemplate;
        }

        public DescribeTagsResponseBodyTagsTagResourceTypeCount setReservedInstance(Integer reservedInstance) {
            this.reservedInstance = reservedInstance;
            return this;
        }
        public Integer getReservedInstance() {
            return this.reservedInstance;
        }

        public DescribeTagsResponseBodyTagsTagResourceTypeCount setSecuritygroup(Integer securitygroup) {
            this.securitygroup = securitygroup;
            return this;
        }
        public Integer getSecuritygroup() {
            return this.securitygroup;
        }

        public DescribeTagsResponseBodyTagsTagResourceTypeCount setSnapshot(Integer snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public Integer getSnapshot() {
            return this.snapshot;
        }

        public DescribeTagsResponseBodyTagsTagResourceTypeCount setSnapshotPolicy(Integer snapshotPolicy) {
            this.snapshotPolicy = snapshotPolicy;
            return this;
        }
        public Integer getSnapshotPolicy() {
            return this.snapshotPolicy;
        }

        public DescribeTagsResponseBodyTagsTagResourceTypeCount setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class DescribeTagsResponseBodyTagsTag extends TeaModel {
        @NameInMap("ResourceTypeCount")
        public DescribeTagsResponseBodyTagsTagResourceTypeCount resourceTypeCount;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeTagsResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyTagsTag self = new DescribeTagsResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyTagsTag setResourceTypeCount(DescribeTagsResponseBodyTagsTagResourceTypeCount resourceTypeCount) {
            this.resourceTypeCount = resourceTypeCount;
            return this;
        }
        public DescribeTagsResponseBodyTagsTagResourceTypeCount getResourceTypeCount() {
            return this.resourceTypeCount;
        }

        public DescribeTagsResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeTagsResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeTagsResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeTagsResponseBodyTagsTag> tag;

        public static DescribeTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyTags self = new DescribeTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyTags setTag(java.util.List<DescribeTagsResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeTagsResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
