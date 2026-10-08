// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DeleteContactTemplatesRequest extends TeaModel {
    /**
     * <p>The IDs of the contact templates to delete. Separate multiple values with commas (,).</p>
     * <p>The system automatically generates an ID upon successful creation of a contact template. You can invoke the <a href="https://help.aliyun.com/document_detail/67701.html">QueryRegistrantProfiles</a> API to query the template IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123,45,67</p>
     */
    @NameInMap("RegistrantProfileIds")
    public String registrantProfileIds;

    /**
     * <p>User IP address. You can set this parameter to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static DeleteContactTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactTemplatesRequest self = new DeleteContactTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactTemplatesRequest setRegistrantProfileIds(String registrantProfileIds) {
        this.registrantProfileIds = registrantProfileIds;
        return this;
    }
    public String getRegistrantProfileIds() {
        return this.registrantProfileIds;
    }

    public DeleteContactTemplatesRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
