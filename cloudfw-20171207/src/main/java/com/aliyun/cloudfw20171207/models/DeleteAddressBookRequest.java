// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteAddressBookRequest extends TeaModel {
    /**
     * <p>The ID of the address book.</p>
     * <p>To delete the address book, you must provide the ID of the address book. You can call the DescribeAddressBook operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0657ab9d-fe8b-4174-b2a6-6baf358e****</p>
     */
    @NameInMap("GroupUuid")
    public String groupUuid;

    /**
     * <p>The natural language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
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

    @Deprecated
    public DeleteAddressBookRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
