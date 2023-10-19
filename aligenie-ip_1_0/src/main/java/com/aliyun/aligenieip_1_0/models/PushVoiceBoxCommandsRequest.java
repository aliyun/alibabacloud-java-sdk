// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PushVoiceBoxCommandsRequest extends TeaModel {
    @NameInMap("Commands")
    public java.util.List<PushVoiceBoxCommandsRequestCommands> commands;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("RoomNo")
    public String roomNo;

    public static PushVoiceBoxCommandsRequest build(java.util.Map<String, ?> map) throws Exception {
        PushVoiceBoxCommandsRequest self = new PushVoiceBoxCommandsRequest();
        return TeaModel.build(map, self);
    }

    public PushVoiceBoxCommandsRequest setCommands(java.util.List<PushVoiceBoxCommandsRequestCommands> commands) {
        this.commands = commands;
        return this;
    }
    public java.util.List<PushVoiceBoxCommandsRequestCommands> getCommands() {
        return this.commands;
    }

    public PushVoiceBoxCommandsRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public PushVoiceBoxCommandsRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

    public static class PushVoiceBoxCommandsRequestCommands extends TeaModel {
        @NameInMap("CommandDomain")
        public String commandDomain;

        @NameInMap("CommandName")
        public String commandName;

        @NameInMap("Payload")
        public String payload;

        public static PushVoiceBoxCommandsRequestCommands build(java.util.Map<String, ?> map) throws Exception {
            PushVoiceBoxCommandsRequestCommands self = new PushVoiceBoxCommandsRequestCommands();
            return TeaModel.build(map, self);
        }

        public PushVoiceBoxCommandsRequestCommands setCommandDomain(String commandDomain) {
            this.commandDomain = commandDomain;
            return this;
        }
        public String getCommandDomain() {
            return this.commandDomain;
        }

        public PushVoiceBoxCommandsRequestCommands setCommandName(String commandName) {
            this.commandName = commandName;
            return this;
        }
        public String getCommandName() {
            return this.commandName;
        }

        public PushVoiceBoxCommandsRequestCommands setPayload(String payload) {
            this.payload = payload;
            return this;
        }
        public String getPayload() {
            return this.payload;
        }

    }

}
