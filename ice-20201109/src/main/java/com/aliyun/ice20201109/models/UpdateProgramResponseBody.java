// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateProgramResponseBody extends TeaModel {
    /**
     * <p>The information about the program.</p>
     */
    @NameInMap("Program")
    public ChannelAssemblyProgram program;

    /**
     * <p><strong>Request ID</strong></p>
     * 
     * <strong>example:</strong>
     * <p>xxx-xxxx-xxxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateProgramResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProgramResponseBody self = new UpdateProgramResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProgramResponseBody setProgram(ChannelAssemblyProgram program) {
        this.program = program;
        return this;
    }
    public ChannelAssemblyProgram getProgram() {
        return this.program;
    }

    public UpdateProgramResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
