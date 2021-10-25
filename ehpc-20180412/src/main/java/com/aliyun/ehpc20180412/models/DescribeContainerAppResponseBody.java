// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeContainerAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ContainerAppInfo")
    public DescribeContainerAppResponseBodyContainerAppInfo containerAppInfo;

    public static DescribeContainerAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerAppResponseBody self = new DescribeContainerAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeContainerAppResponseBody setContainerAppInfo(DescribeContainerAppResponseBodyContainerAppInfo containerAppInfo) {
        this.containerAppInfo = containerAppInfo;
        return this;
    }
    public DescribeContainerAppResponseBodyContainerAppInfo getContainerAppInfo() {
        return this.containerAppInfo;
    }

    public static class DescribeContainerAppResponseBodyContainerAppInfo extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Repository")
        public String repository;

        @NameInMap("ImageTag")
        public String imageTag;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static DescribeContainerAppResponseBodyContainerAppInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerAppResponseBodyContainerAppInfo self = new DescribeContainerAppResponseBodyContainerAppInfo();
            return TeaModel.build(map, self);
        }

        public DescribeContainerAppResponseBodyContainerAppInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeContainerAppResponseBodyContainerAppInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeContainerAppResponseBodyContainerAppInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeContainerAppResponseBodyContainerAppInfo setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
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

        public DescribeContainerAppResponseBodyContainerAppInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
