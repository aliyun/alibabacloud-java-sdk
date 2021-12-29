// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListConferenceUsersRequest extends TeaModel {
    // 会议唯一标识符
    @NameInMap("ConferenceId")
    public String conferenceId;

    // 查询页码，从第1页开始。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页显示个数，最大显示个数为100。
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListConferenceUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConferenceUsersRequest self = new ListConferenceUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListConferenceUsersRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public ListConferenceUsersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConferenceUsersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
