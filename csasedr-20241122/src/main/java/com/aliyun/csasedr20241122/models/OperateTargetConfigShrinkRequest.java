// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class OperateTargetConfigShrinkRequest extends TeaModel {
    /**
     * <p>The key of the rule switch configuration associated with the policy. It must be the same as the key used in the ListSystemConfigRules query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8b37f46a-72d9-4c8c-bada-2f374a9c3410</p>
     */
    @NameInMap("SelectionKey")
    public String selectionKey;

    /**
     * <p>The status of the rule switch. Valid values:</p>
     * <ul>
     * <li><strong>add</strong>: Enabled.</li>
     * <li><strong>del</strong>: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>add</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of system rule switch identifiers whose status is to be updated. The elements are obtained from the SwitchId returned by ListSystemConfigRules. A maximum of 100 items are supported. The backend updates the items one by one based on the list. The request is rejected if the list is not provided.</p>
     */
    @NameInMap("SwitchIdList")
    public String switchIdListShrink;

    public static OperateTargetConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateTargetConfigShrinkRequest self = new OperateTargetConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public OperateTargetConfigShrinkRequest setSelectionKey(String selectionKey) {
        this.selectionKey = selectionKey;
        return this;
    }
    public String getSelectionKey() {
        return this.selectionKey;
    }

    public OperateTargetConfigShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OperateTargetConfigShrinkRequest setSwitchIdListShrink(String switchIdListShrink) {
        this.switchIdListShrink = switchIdListShrink;
        return this;
    }
    public String getSwitchIdListShrink() {
        return this.switchIdListShrink;
    }

}
