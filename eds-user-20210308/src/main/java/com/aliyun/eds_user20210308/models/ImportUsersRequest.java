// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ImportUsersRequest extends TeaModel {
    @NameInMap("Users")
    public String users;

    @NameInMap("Emails")
    public String emails;

    @NameInMap("Password")
    public String password;

    @NameInMap("TaskId")
    public String taskId;

    public static ImportUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportUsersRequest self = new ImportUsersRequest();
        return TeaModel.build(map, self);
    }

    public ImportUsersRequest setUsers(String users) {
        this.users = users;
        return this;
    }
    public String getUsers() {
        return this.users;
    }

    public ImportUsersRequest setEmails(String emails) {
        this.emails = emails;
        return this;
    }
    public String getEmails() {
        return this.emails;
    }

    public ImportUsersRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ImportUsersRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
