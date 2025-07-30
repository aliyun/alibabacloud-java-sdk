// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitParentsResponseBody extends TeaModel {
    /**
     * <p>The parent organizations.</p>
     */
    @NameInMap("Parents")
    public java.util.List<ListOrganizationalUnitParentsResponseBodyParents> parents;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
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
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_4lag76zc2km5ssg5vsmm2xxxx</p>
         */
        @NameInMap("OrganizationalUnitId")
        public String organizationalUnitId;

        /**
         * <p>The parent organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_x3beoyepv2ls5iwuge3xhjxxxx</p>
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
