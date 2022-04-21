// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListSpaceResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Spaces")
    public java.util.List<ListSpaceResponseBodySpaces> spaces;

    public static ListSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSpaceResponseBody self = new ListSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSpaceResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListSpaceResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ListSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSpaceResponseBody setSpaces(java.util.List<ListSpaceResponseBodySpaces> spaces) {
        this.spaces = spaces;
        return this;
    }
    public java.util.List<ListSpaceResponseBodySpaces> getSpaces() {
        return this.spaces;
    }

    public static class ListSpaceResponseBodySpaces extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtLastAccess")
        public Long gmtLastAccess;

        @NameInMap("Name")
        public String name;

        @NameInMap("SpaceId")
        public String spaceId;

        @NameInMap("Status")
        public String status;

        public static ListSpaceResponseBodySpaces build(java.util.Map<String, ?> map) throws Exception {
            ListSpaceResponseBodySpaces self = new ListSpaceResponseBodySpaces();
            return TeaModel.build(map, self);
        }

        public ListSpaceResponseBodySpaces setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListSpaceResponseBodySpaces setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSpaceResponseBodySpaces setGmtLastAccess(Long gmtLastAccess) {
            this.gmtLastAccess = gmtLastAccess;
            return this;
        }
        public Long getGmtLastAccess() {
            return this.gmtLastAccess;
        }

        public ListSpaceResponseBodySpaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSpaceResponseBodySpaces setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public ListSpaceResponseBodySpaces setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
