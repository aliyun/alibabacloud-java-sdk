// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitParentsResponseBody extends TeaModel {
    @NameInMap("Parents")
    public java.util.List<ListOrganizationalUnitParentsResponseBodyParents> parents;

    @NameInMap("RequestId")
    public String requestId;

    public static ListOrganizationalUnitParentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitParentsResponseBody self = new ListOrganizationalUnitParentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitParentsResponseBody setParents(java.util.List<ListOrganizationalUnitParentsResponseBodyParents> parents) {
        this.parents = parents;
        return this;
    }
    public java.util.List<ListOrganizationalUnitParentsResponseBodyParents> getParents() {
        return this.parents;
    }

    public ListOrganizationalUnitParentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListOrganizationalUnitParentsResponseBodyParents extends TeaModel {
        /**
         * <p>组织ID</p>
         */
        @NameInMap("OrganizationalUnitId")
        public String organizationalUnitId;

        /**
         * <p>父组织ID</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        public static ListOrganizationalUnitParentsResponseBodyParents build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationalUnitParentsResponseBodyParents self = new ListOrganizationalUnitParentsResponseBodyParents();
            return TeaModel.build(map, self);
        }

        public ListOrganizationalUnitParentsResponseBodyParents setOrganizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        public ListOrganizationalUnitParentsResponseBodyParents setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

    }

}
