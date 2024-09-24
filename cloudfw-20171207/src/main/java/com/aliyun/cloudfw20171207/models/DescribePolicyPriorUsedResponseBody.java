// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePolicyPriorUsedResponseBody extends TeaModel {
    /**
     * <p>The lowest priority of existing access control policies.</p>
     * <blockquote>
     * <p> The value -1 indicates the lowest priority.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("End")
    public Integer end;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The highest priority of existing access control policies.</p>
     * <blockquote>
     * <p> The value 0 indicates the highest priority.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Start")
    public Integer start;

    public static DescribePolicyPriorUsedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyPriorUsedResponseBody self = new DescribePolicyPriorUsedResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyPriorUsedResponseBody setEnd(Integer end) {
        this.end = end;
        return this;
    }
    public Integer getEnd() {
        return this.end;
    }

    public DescribePolicyPriorUsedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolicyPriorUsedResponseBody setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
