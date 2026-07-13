// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteGtmRecoveryPlanRequest extends TeaModel {
    /**
     * <p>The language of the response. The default value is <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the disaster recovery plan.&lt;props=&quot;intl&quot;&gt; To obtain the ID, call <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-describegtmrecoveryplans?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeGtmRecoveryPlans</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10********</p>
     */
    @NameInMap("RecoveryPlanId")
    public Long recoveryPlanId;

    public static DeleteGtmRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGtmRecoveryPlanRequest self = new DeleteGtmRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGtmRecoveryPlanRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteGtmRecoveryPlanRequest setRecoveryPlanId(Long recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public Long getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

}
