// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForSynchronizingDnsHostRequest extends TeaModel {
    /**
     * <p>Domain instance ID, which can be obtained by invoking the <a href="https://help.aliyun.com/document_detail/67712.html">QueryDomainList</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ST2017120814571100001303</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Language for error messages returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>User IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveSingleTaskForSynchronizingDnsHostRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForSynchronizingDnsHostRequest self = new SaveSingleTaskForSynchronizingDnsHostRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForSynchronizingDnsHostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveSingleTaskForSynchronizingDnsHostRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForSynchronizingDnsHostRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
