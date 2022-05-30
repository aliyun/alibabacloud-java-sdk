// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDutyRostersRequest extends TeaModel {
    @NameInMap("DutyRosterName")
    public String dutyRosterName;

    @NameInMap("DutyRosterOwner")
    public String dutyRosterOwner;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDutyRostersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDutyRostersRequest self = new ListDutyRostersRequest();
        return TeaModel.build(map, self);
    }

    public ListDutyRostersRequest setDutyRosterName(String dutyRosterName) {
        this.dutyRosterName = dutyRosterName;
        return this;
    }
    public String getDutyRosterName() {
        return this.dutyRosterName;
    }

    public ListDutyRostersRequest setDutyRosterOwner(String dutyRosterOwner) {
        this.dutyRosterOwner = dutyRosterOwner;
        return this;
    }
    public String getDutyRosterOwner() {
        return this.dutyRosterOwner;
    }

    public ListDutyRostersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDutyRostersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
