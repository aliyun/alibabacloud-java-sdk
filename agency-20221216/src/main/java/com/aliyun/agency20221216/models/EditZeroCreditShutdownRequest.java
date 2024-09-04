// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class EditZeroCreditShutdownRequest extends TeaModel {
    /**
     * <p>UID</p>
     * 
     * <strong>example:</strong>
     * <p>Shutdown Policy</br></p>
     * <ul>
     * <li><p>immediatelyStop, The instances of the specified End User\&quot;s account will be shutdown immediately once EU triggered the Shutdown Policy.</br></p>
     * </li>
     * <li><p>delayStop, The instances of the specified End User\&quot;s account will be shutdown later, even EU have triggered the Shutdown Policy.</br></p>
     * </li>
     * <li><p>noStop, The instances of the specified End User\&quot;s account will not be shutdown, after EU have triggered the Shutdown Policy.</br></p>
     * </li>
     * </ul>
     */
    @NameInMap("ShutdownPolicy")
    public String shutdownPolicy;

    /**
     * <p>No Change History</p>
     * 
     * <strong>example:</strong>
     * <p>1263644979775567</p>
     */
    @NameInMap("Uid")
    public Long uid;

    public static EditZeroCreditShutdownRequest build(java.util.Map<String, ?> map) throws Exception {
        EditZeroCreditShutdownRequest self = new EditZeroCreditShutdownRequest();
        return TeaModel.build(map, self);
    }

    public EditZeroCreditShutdownRequest setShutdownPolicy(String shutdownPolicy) {
        this.shutdownPolicy = shutdownPolicy;
        return this;
    }
    public String getShutdownPolicy() {
        return this.shutdownPolicy;
    }

    public EditZeroCreditShutdownRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
