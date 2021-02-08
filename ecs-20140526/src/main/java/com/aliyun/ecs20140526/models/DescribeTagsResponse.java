// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Tags")
    @Validation(required = true)
    public DescribeTagsResponseTags tags;

    public static DescribeTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsResponse self = new DescribeTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTagsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTagsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeTagsResponse setTags(DescribeTagsResponseTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeTagsResponseTags getTags() {
        return this.tags;
    }

    public static class DescribeTagsResponseTagsTagResourceTypeCount extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public Integer instance;

        @NameInMap("Disk")
        @Validation(required = true)
        public Integer disk;

        @NameInMap("Volume")
        @Validation(required = true)
        public Integer volume;

        @NameInMap("Image")
        @Validation(required = true)
        public Integer image;

        @NameInMap("Snapshot")
        @Validation(required = true)
        public Integer snapshot;

        @NameInMap("Securitygroup")
        @Validation(required = true)
        public Integer securitygroup;

        @NameInMap("LaunchTemplate")
        @Validation(required = true)
        public Integer launchTemplate;

        @NameInMap("Eni")
        @Validation(required = true)
        public Integer eni;

        @NameInMap("Ddh")
        @Validation(required = true)
        public Integer ddh;

        @NameInMap("KeyPair")
        @Validation(required = true)
        public Integer keyPair;

        @NameInMap("SnapshotPolicy")
        @Validation(required = true)
        public Integer snapshotPolicy;

        @NameInMap("ReservedInstance")
        @Validation(required = true)
        public Integer reservedInstance;

        public static DescribeTagsResponseTagsTagResourceTypeCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseTagsTagResourceTypeCount self = new DescribeTagsResponseTagsTagResourceTypeCount();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseTagsTagResourceTypeCount setInstance(Integer instance) {
            this.instance = instance;
            return this;
        }
        public Integer getInstance() {
            return this.instance;
        }

        public DescribeTagsResponseTagsTagResourceTypeCount setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeTagsResponseTagsTagResourceTypeCount setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

        public DescribeTagsResponseTagsTagResourceTypeCount setImage(Integer image) {
            this.image = image;
            return this;
        }
        public Integer getImage() {
            return this.image;
        }

        public DescribeTagsResponseTagsTagResourceTypeCount setSnapshot(Integer snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public Integer getSnapshot() {
            return this.snapshot;
        }

        public DescribeTagsResponseTagsTagResourceTypeCount setSecuritygroup(Integer securitygroup) {
            this.securitygroup = securitygroup;
            return this;
        }
        public Integer getSecuritygroup() {
            return this.securitygroup;
        }

        public DescribeTagsResponseTagsTagResourceTypeCount setLaunchTemplate(Integer launchTemplate) {
            this.launchTemplate = launchTemplate;
            return this;
        }
        public Integer getLaunchTemplate() {
            return this.launchTemplate;
        }

        public DescribeTagsResponseTagsTagResourceTypeCount setEni(Integer eni) {
            this.eni = eni;
            return this;
        }
        public Integer getEni() {
            return this.eni;
        }

        public DescribeTagsResponseTagsTagResourceTypeCount setDdh(Integer ddh) {
            this.ddh = ddh;
            return this;
        }
        public Integer getDdh() {
            return this.ddh;
        }

        public DescribeTagsResponseTagsTagResourceTypeCount setKeyPair(Integer keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public Integer getKeyPair() {
            return this.keyPair;
        }

        public DescribeTagsResponseTagsTagResourceTypeCount setSnapshotPolicy(Integer snapshotPolicy) {
            this.snapshotPolicy = snapshotPolicy;
            return this;
        }
        public Integer getSnapshotPolicy() {
            return this.snapshotPolicy;
        }

        public DescribeTagsResponseTagsTagResourceTypeCount setReservedInstance(Integer reservedInstance) {
            this.reservedInstance = reservedInstance;
            return this;
        }
        public Integer getReservedInstance() {
            return this.reservedInstance;
        }

    }

    public static class DescribeTagsResponseTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        @NameInMap("ResourceTypeCount")
        @Validation(required = true)
        public DescribeTagsResponseTagsTagResourceTypeCount resourceTypeCount;

        public static DescribeTagsResponseTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseTagsTag self = new DescribeTagsResponseTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeTagsResponseTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeTagsResponseTagsTag setResourceTypeCount(DescribeTagsResponseTagsTagResourceTypeCount resourceTypeCount) {
            this.resourceTypeCount = resourceTypeCount;
            return this;
        }
        public DescribeTagsResponseTagsTagResourceTypeCount getResourceTypeCount() {
            return this.resourceTypeCount;
        }

    }

    public static class DescribeTagsResponseTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeTagsResponseTagsTag> tag;

        public static DescribeTagsResponseTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseTags self = new DescribeTagsResponseTags();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseTags setTag(java.util.List<DescribeTagsResponseTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeTagsResponseTagsTag> getTag() {
            return this.tag;
        }

    }

}
