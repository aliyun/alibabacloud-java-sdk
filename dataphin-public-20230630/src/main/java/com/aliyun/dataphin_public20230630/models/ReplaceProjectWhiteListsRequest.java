// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ReplaceProjectWhiteListsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1030111021</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReplaceCommand")
    public ReplaceProjectWhiteListsRequestReplaceCommand replaceCommand;

    public static ReplaceProjectWhiteListsRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceProjectWhiteListsRequest self = new ReplaceProjectWhiteListsRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceProjectWhiteListsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ReplaceProjectWhiteListsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ReplaceProjectWhiteListsRequest setReplaceCommand(ReplaceProjectWhiteListsRequestReplaceCommand replaceCommand) {
        this.replaceCommand = replaceCommand;
        return this;
    }
    public ReplaceProjectWhiteListsRequestReplaceCommand getReplaceCommand() {
        return this.replaceCommand;
    }

    public static class ReplaceProjectWhiteListsRequestReplaceCommandWhiteLists extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>ip</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.0.2</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5432</p>
         */
        @NameInMap("Port")
        public String port;

        public static ReplaceProjectWhiteListsRequestReplaceCommandWhiteLists build(java.util.Map<String, ?> map) throws Exception {
            ReplaceProjectWhiteListsRequestReplaceCommandWhiteLists self = new ReplaceProjectWhiteListsRequestReplaceCommandWhiteLists();
            return TeaModel.build(map, self);
        }

        public ReplaceProjectWhiteListsRequestReplaceCommandWhiteLists setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ReplaceProjectWhiteListsRequestReplaceCommandWhiteLists setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ReplaceProjectWhiteListsRequestReplaceCommandWhiteLists setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class ReplaceProjectWhiteListsRequestReplaceCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("WhiteLists")
        public java.util.List<ReplaceProjectWhiteListsRequestReplaceCommandWhiteLists> whiteLists;

        public static ReplaceProjectWhiteListsRequestReplaceCommand build(java.util.Map<String, ?> map) throws Exception {
            ReplaceProjectWhiteListsRequestReplaceCommand self = new ReplaceProjectWhiteListsRequestReplaceCommand();
            return TeaModel.build(map, self);
        }

        public ReplaceProjectWhiteListsRequestReplaceCommand setWhiteLists(java.util.List<ReplaceProjectWhiteListsRequestReplaceCommandWhiteLists> whiteLists) {
            this.whiteLists = whiteLists;
            return this;
        }
        public java.util.List<ReplaceProjectWhiteListsRequestReplaceCommandWhiteLists> getWhiteLists() {
            return this.whiteLists;
        }

    }

}
