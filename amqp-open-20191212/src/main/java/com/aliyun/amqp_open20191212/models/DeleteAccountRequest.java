// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteAccountRequest extends TeaModel {
    /**
     * <p>The timestamp that indicates when the pair of static username and password that you want to delete was created. Unit: milliseconds.</p>
     * <br>
     * <p>You can call the [ListAccounts](~~472730~~) operation to view the timestamp.</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <p>The pair of username and password that you want to delete.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static DeleteAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountRequest self = new DeleteAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccountRequest setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DeleteAccountRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
