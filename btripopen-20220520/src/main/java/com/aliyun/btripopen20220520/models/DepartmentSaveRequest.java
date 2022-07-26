// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DepartmentSaveRequest extends TeaModel {
    @NameInMap("depart_list")
    public java.util.List<DepartmentSaveRequestDepartList> departList;

    @NameInMap("user_id")
    public String userId;

    public static DepartmentSaveRequest build(java.util.Map<String, ?> map) throws Exception {
        DepartmentSaveRequest self = new DepartmentSaveRequest();
        return TeaModel.build(map, self);
    }

    public DepartmentSaveRequest setDepartList(java.util.List<DepartmentSaveRequestDepartList> departList) {
        this.departList = departList;
        return this;
    }
    public java.util.List<DepartmentSaveRequestDepartList> getDepartList() {
        return this.departList;
    }

    public DepartmentSaveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class DepartmentSaveRequestDepartList extends TeaModel {
        @NameInMap("depart_id")
        public Long departId;

        @NameInMap("depart_name")
        public String departName;

        @NameInMap("depart_pid")
        public Long departPid;

        @NameInMap("manager_ids")
        public String managerIds;

        @NameInMap("status")
        public Integer status;

        @NameInMap("third_depart_id")
        public String thirdDepartId;

        @NameInMap("third_depart_pid")
        public String thirdDepartPid;

        public static DepartmentSaveRequestDepartList build(java.util.Map<String, ?> map) throws Exception {
            DepartmentSaveRequestDepartList self = new DepartmentSaveRequestDepartList();
            return TeaModel.build(map, self);
        }

        public DepartmentSaveRequestDepartList setDepartId(Long departId) {
            this.departId = departId;
            return this;
        }
        public Long getDepartId() {
            return this.departId;
        }

        public DepartmentSaveRequestDepartList setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public DepartmentSaveRequestDepartList setDepartPid(Long departPid) {
            this.departPid = departPid;
            return this;
        }
        public Long getDepartPid() {
            return this.departPid;
        }

        public DepartmentSaveRequestDepartList setManagerIds(String managerIds) {
            this.managerIds = managerIds;
            return this;
        }
        public String getManagerIds() {
            return this.managerIds;
        }

        public DepartmentSaveRequestDepartList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DepartmentSaveRequestDepartList setThirdDepartId(String thirdDepartId) {
            this.thirdDepartId = thirdDepartId;
            return this;
        }
        public String getThirdDepartId() {
            return this.thirdDepartId;
        }

        public DepartmentSaveRequestDepartList setThirdDepartPid(String thirdDepartPid) {
            this.thirdDepartPid = thirdDepartPid;
            return this;
        }
        public String getThirdDepartPid() {
            return this.thirdDepartPid;
        }

    }

}
