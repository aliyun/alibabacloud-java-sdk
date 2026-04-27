// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentUnlinkRequest extends TeaModel {
    /**
     * <p>座席工号；取值3-10位正整数，参数cno,uniqueId和requestUniqueId三选一</p>
     * 
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("Cno")
    public String cno;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>请求唯一标识；参数cno,uniqueId和requestUniqueId三选一。注意：requestUniqueId挂机功能只在呼叫类型为webcall时生效，且需提前在管理后台将功能开启</p>
     * 
     * <strong>example:</strong>
     * <p>1233456789</p>
     */
    @NameInMap("RequestUniqueId")
    public String requestUniqueId;

    /**
     * <p>是否座席侧挂机；取值范围：1,2（数字含义，座席侧，非座席侧)，默认座席侧</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Side")
    public Long side;

    /**
     * <p>通话唯一标识；参数cno,uniqueId和requestUniqueId三选一</p>
     * 
     * <strong>example:</strong>
     * <p>1233456789</p>
     */
    @NameInMap("UniqueId")
    public String uniqueId;

    public static CloudAgentUnlinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentUnlinkRequest self = new CloudAgentUnlinkRequest();
        return TeaModel.build(map, self);
    }

    public CloudAgentUnlinkRequest setCno(String cno) {
        this.cno = cno;
        return this;
    }
    public String getCno() {
        return this.cno;
    }

    public CloudAgentUnlinkRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudAgentUnlinkRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public CloudAgentUnlinkRequest setSide(Long side) {
        this.side = side;
        return this;
    }
    public Long getSide() {
        return this.side;
    }

    public CloudAgentUnlinkRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
