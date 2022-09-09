// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListTaskResourceResponseBody extends TeaModel {
    @NameInMap("count")
    public Long count;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resources")
    public java.util.List<ListTaskResourceResponseBodyResources> resources;

    public static ListTaskResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskResourceResponseBody self = new ListTaskResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskResourceResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListTaskResourceResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListTaskResourceResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTaskResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskResourceResponseBody setResources(java.util.List<ListTaskResourceResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ListTaskResourceResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class ListTaskResourceResponseBodyResources extends TeaModel {
        @NameInMap("instanceAttribute")
        public String instanceAttribute;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("jobId")
        public String jobId;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static ListTaskResourceResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListTaskResourceResponseBodyResources self = new ListTaskResourceResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListTaskResourceResponseBodyResources setInstanceAttribute(String instanceAttribute) {
            this.instanceAttribute = instanceAttribute;
            return this;
        }
        public String getInstanceAttribute() {
            return this.instanceAttribute;
        }

        public ListTaskResourceResponseBodyResources setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListTaskResourceResponseBodyResources setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListTaskResourceResponseBodyResources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTaskResourceResponseBodyResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
