// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListBlacklistCallTaggingsRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Contact Center instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>A list of numbers to query for their blacklist tag status. The jobId field is required if a number is encrypted (contains \<em>\</em>\*).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;number&quot;:&quot;1521083xxxx&quot;,&quot;jobId&quot;:&quot;job-481841171213393920&quot;}]</p>
     */
    @NameInMap("NumberList")
    public String numberList;

    public static ListBlacklistCallTaggingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBlacklistCallTaggingsRequest self = new ListBlacklistCallTaggingsRequest();
        return TeaModel.build(map, self);
    }

    public ListBlacklistCallTaggingsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListBlacklistCallTaggingsRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

}
