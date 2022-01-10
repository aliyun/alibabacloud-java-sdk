// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListImagesResponseBody extends TeaModel {
    // 镜像列表
    @NameInMap("Images")
    public java.util.List<ListImagesResponseBodyImages> images;

    // 总数
    @NameInMap("TotalCount")
    public Long totalCount;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static ListImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImagesResponseBody self = new ListImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImagesResponseBody setImages(java.util.List<ListImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ListImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public ListImagesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListImagesResponseBodyImagesLabels extends TeaModel {
        // Key
        @NameInMap("Key")
        public String key;

        // Value
        @NameInMap("Value")
        public String value;

        public static ListImagesResponseBodyImagesLabels build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImagesLabels self = new ListImagesResponseBodyImagesLabels();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImagesLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListImagesResponseBodyImagesLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListImagesResponseBodyImages extends TeaModel {
        // 可见性
        @NameInMap("Accessibility")
        public String accessibility;

        // 镜像描述
        @NameInMap("Description")
        public String description;

        // 创建 UTC 时间，日期格式 iso8601
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        // 修改时间
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        // 镜像id
        @NameInMap("ImageId")
        public String imageId;

        // 镜像地址，包含版本号
        @NameInMap("ImageUri")
        public String imageUri;

        // 镜像标签，是个map
        @NameInMap("Labels")
        public java.util.List<ListImagesResponseBodyImagesLabels> labels;

        // 镜像名称
        @NameInMap("Name")
        public String name;

        // 创建人
        @NameInMap("OperatorCreate")
        public String operatorCreate;

        // 父创建人
        @NameInMap("ParentOperatorCreate")
        public String parentOperatorCreate;

        // 工作空间id
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImages self = new ListImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImages setAccessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public String getAccessibility() {
            return this.accessibility;
        }

        public ListImagesResponseBodyImages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListImagesResponseBodyImages setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListImagesResponseBodyImages setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListImagesResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListImagesResponseBodyImages setImageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public String getImageUri() {
            return this.imageUri;
        }

        public ListImagesResponseBodyImages setLabels(java.util.List<ListImagesResponseBodyImagesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListImagesResponseBodyImagesLabels> getLabels() {
            return this.labels;
        }

        public ListImagesResponseBodyImages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListImagesResponseBodyImages setOperatorCreate(String operatorCreate) {
            this.operatorCreate = operatorCreate;
            return this;
        }
        public String getOperatorCreate() {
            return this.operatorCreate;
        }

        public ListImagesResponseBodyImages setParentOperatorCreate(String parentOperatorCreate) {
            this.parentOperatorCreate = parentOperatorCreate;
            return this;
        }
        public String getParentOperatorCreate() {
            return this.parentOperatorCreate;
        }

        public ListImagesResponseBodyImages setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
