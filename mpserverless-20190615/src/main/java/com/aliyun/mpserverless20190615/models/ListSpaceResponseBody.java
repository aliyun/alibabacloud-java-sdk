// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListSpaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Spaces")
    public java.util.List<ListSpaceResponseBodySpaces> spaces;

    public static ListSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSpaceResponseBody self = new ListSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSpaceResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ListSpaceResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListSpaceResponseBody setSpaces(java.util.List<ListSpaceResponseBodySpaces> spaces) {
        this.spaces = spaces;
        return this;
    }
    public java.util.List<ListSpaceResponseBodySpaces> getSpaces() {
        return this.spaces;
    }

    public static class ListSpaceResponseBodySpaces extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("SpaceId")
        public String spaceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Desc")
        public String desc;

        public static ListSpaceResponseBodySpaces build(java.util.Map<String, ?> map) throws Exception {
            ListSpaceResponseBodySpaces self = new ListSpaceResponseBodySpaces();
            return TeaModel.build(map, self);
        }

        public ListSpaceResponseBodySpaces setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSpaceResponseBodySpaces setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSpaceResponseBodySpaces setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public ListSpaceResponseBodySpaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSpaceResponseBodySpaces setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

}
