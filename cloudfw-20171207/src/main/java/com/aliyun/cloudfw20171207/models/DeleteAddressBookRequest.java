// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteAddressBookRequest extends TeaModel {
    // The ID of the address book.
    // 
    // To delete the address book, you must provide the ID of the address book. You can call the DescribeAddressBook operation to query the ID.
    @NameInMap("GroupUuid")
    public String groupUuid;

    // The natural language of the request and response. Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteAddressBookRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAddressBookRequest self = new DeleteAddressBookRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAddressBookRequest setGroupUuid(String groupUuid) {
        this.groupUuid = groupUuid;
        return this;
    }
    public String getGroupUuid() {
        return this.groupUuid;
    }

    public DeleteAddressBookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteAddressBookRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
