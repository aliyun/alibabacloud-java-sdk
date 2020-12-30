// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListRolesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Paging")
    public Boolean paging;

    @NameInMap("Data")
    public ListRolesResponseBodyData data;

    public static ListRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRolesResponseBody self = new ListRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRolesResponseBody setPaging(Boolean paging) {
        this.paging = paging;
        return this;
    }
    public Boolean getPaging() {
        return this.paging;
    }

    public ListRolesResponseBody setData(ListRolesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRolesResponseBodyData getData() {
        return this.data;
    }

    public static class ListRolesResponseBodyDataRoleDTO extends TeaModel {
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        public static ListRolesResponseBodyDataRoleDTO build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyDataRoleDTO self = new ListRolesResponseBodyDataRoleDTO();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyDataRoleDTO setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListRolesResponseBodyDataRoleDTO setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRolesResponseBodyDataRoleDTO setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListRolesResponseBodyDataRoleDTO setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRolesResponseBodyDataRoleDTO setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListRolesResponseBodyDataRoleDTO setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListRolesResponseBodyData extends TeaModel {
        @NameInMap("roleDTO")
        public java.util.List<ListRolesResponseBodyDataRoleDTO> roleDTO;

        public static ListRolesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyData self = new ListRolesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyData setRoleDTO(java.util.List<ListRolesResponseBodyDataRoleDTO> roleDTO) {
            this.roleDTO = roleDTO;
            return this;
        }
        public java.util.List<ListRolesResponseBodyDataRoleDTO> getRoleDTO() {
            return this.roleDTO;
        }

    }

}
