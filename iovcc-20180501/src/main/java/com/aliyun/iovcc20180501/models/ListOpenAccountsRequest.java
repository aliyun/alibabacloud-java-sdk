// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListOpenAccountsRequest extends TeaModel {
    @NameInMap("Length")
    public Integer length;

    @NameInMap("Start")
    public Integer start;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("Email")
    public String email;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("ProjectId")
    public String projectId;

    public static ListOpenAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOpenAccountsRequest self = new ListOpenAccountsRequest();
        return TeaModel.build(map, self);
    }

    public ListOpenAccountsRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public ListOpenAccountsRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public ListOpenAccountsRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ListOpenAccountsRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ListOpenAccountsRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListOpenAccountsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
