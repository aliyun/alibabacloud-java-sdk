// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resource")
    public GetResourceResponseBodyResource resource;

    public static GetResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceResponseBody self = new GetResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceResponseBody setResource(GetResourceResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public GetResourceResponseBodyResource getResource() {
        return this.resource;
    }

    public static class GetResourceResponseBodyResource extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Spec")
        public String spec;

        public static GetResourceResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            GetResourceResponseBodyResource self = new GetResourceResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public GetResourceResponseBodyResource setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetResourceResponseBodyResource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetResourceResponseBodyResource setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetResourceResponseBodyResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetResourceResponseBodyResource setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetResourceResponseBodyResource setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetResourceResponseBodyResource setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

}
