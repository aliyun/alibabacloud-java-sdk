// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateDialogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>taobao</p>
     */
    @NameInMap("channel")
    public String channel;

    @NameInMap("enableLibrary")
    public Boolean enableLibrary;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("metaData")
    public java.util.Map<String, ?> metaData;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>live_broadcast_qa</p>
     */
    @NameInMap("playCode")
    public String playCode;

    @NameInMap("qaLibraryList")
    public java.util.List<String> qaLibraryList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ebf83826-dc1c-46f8-9759-0fb6da4c8xxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("selfDirected")
    public Boolean selfDirected;

    public static CreateDialogRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDialogRequest self = new CreateDialogRequest();
        return TeaModel.build(map, self);
    }

    public CreateDialogRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CreateDialogRequest setEnableLibrary(Boolean enableLibrary) {
        this.enableLibrary = enableLibrary;
        return this;
    }
    public Boolean getEnableLibrary() {
        return this.enableLibrary;
    }

    public CreateDialogRequest setMetaData(java.util.Map<String, ?> metaData) {
        this.metaData = metaData;
        return this;
    }
    public java.util.Map<String, ?> getMetaData() {
        return this.metaData;
    }

    public CreateDialogRequest setPlayCode(String playCode) {
        this.playCode = playCode;
        return this;
    }
    public String getPlayCode() {
        return this.playCode;
    }

    public CreateDialogRequest setQaLibraryList(java.util.List<String> qaLibraryList) {
        this.qaLibraryList = qaLibraryList;
        return this;
    }
    public java.util.List<String> getQaLibraryList() {
        return this.qaLibraryList;
    }

    public CreateDialogRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDialogRequest setSelfDirected(Boolean selfDirected) {
        this.selfDirected = selfDirected;
        return this;
    }
    public Boolean getSelfDirected() {
        return this.selfDirected;
    }

}
