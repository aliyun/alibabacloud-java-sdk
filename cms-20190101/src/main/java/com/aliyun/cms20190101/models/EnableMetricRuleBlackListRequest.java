// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableMetricRuleBlackListRequest extends TeaModel {
    /**
     * <p>The IDs of the blacklist policies. Separate multiple IDs with commas (,). You can specify up to 50 IDs.</p>
     * <p>For information about how to obtain the ID of a blacklist policy, see <a href="https://help.aliyun.com/document_detail/457257.html">DescribeMetricRuleBlackList</a>.</p>
     * <blockquote>
     * <p>You can also set this parameter to a JSON array. Example: <code>[&quot;a9ad2ac2-3ed9-11ed-b878-0242ac12****&quot;,&quot;5cb8a9a4-198f-4651-a353-f8b28788****&quot;]</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a9ad2ac2-3ed9-11ed-b878-0242ac12****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Specifies whether to enable the blacklist policy. Valid values:</p>
     * <ul>
     * <li>true: The blacklist policy is enabled.</li>
     * <li>false (default): The blacklist policy is disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsEnable")
    public Boolean isEnable;

    @NameInMap("RegionId")
    public String regionId;

    public static EnableMetricRuleBlackListRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMetricRuleBlackListRequest self = new EnableMetricRuleBlackListRequest();
        return TeaModel.build(map, self);
    }

    public EnableMetricRuleBlackListRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public EnableMetricRuleBlackListRequest setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
        return this;
    }
    public Boolean getIsEnable() {
        return this.isEnable;
    }

    public EnableMetricRuleBlackListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
