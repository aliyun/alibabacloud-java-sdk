// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeContainerAppResponseBody extends TeaModel {
    /**
     * <p>The information of the containerized application.</p>
     */
    @NameInMap("ContainerAppInfo")
    public DescribeContainerAppResponseBodyContainerAppInfo containerAppInfo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContainerAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerAppResponseBody self = new DescribeContainerAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerAppResponseBody setContainerAppInfo(DescribeContainerAppResponseBodyContainerAppInfo containerAppInfo) {
        this.containerAppInfo = containerAppInfo;
        return this;
    }
    public DescribeContainerAppResponseBodyContainerAppInfo getContainerAppInfo() {
        return this.containerAppInfo;
    }

    public DescribeContainerAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContainerAppResponseBodyContainerAppInfo extends TeaModel {
        /**
         * <p>The time when the containerized application was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the containerized application.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the containerized application.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The tags of the image.</p>
         */
        @NameInMap("ImageTag")
        public String imageTag;

        /**
         * <p>The name of the containerized application.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the repository.</p>
         */
        @NameInMap("Repository")
        public String repository;

        /**
         * <p>The type of the container. Set the value to singularity.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeContainerAppResponseBodyContainerAppInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerAppResponseBodyContainerAppInfo self = new DescribeContainerAppResponseBodyContainerAppInfo();
            return TeaModel.build(map, self);
        }

        public DescribeContainerAppResponseBodyContainerAppInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeContainerAppResponseBodyContainerAppInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeContainerAppResponseBodyContainerAppInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeContainerAppResponseBodyContainerAppInfo setImageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public String getImageTag() {
            return this.imageTag;
        }

        public DescribeContainerAppResponseBodyContainerAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerAppResponseBodyContainerAppInfo setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public DescribeContainerAppResponseBodyContainerAppInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
