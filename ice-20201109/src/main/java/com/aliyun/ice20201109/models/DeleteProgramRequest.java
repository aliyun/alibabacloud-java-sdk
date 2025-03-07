// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteProgramRequest extends TeaModel {
    /**
     * <p>The name of the channel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyChannel</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>The name of the program.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>program_name</p>
     */
    @NameInMap("ProgramName")
    public String programName;

    public static DeleteProgramRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProgramRequest self = new DeleteProgramRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProgramRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public DeleteProgramRequest setProgramName(String programName) {
        this.programName = programName;
        return this;
    }
    public String getProgramName() {
        return this.programName;
    }

}
