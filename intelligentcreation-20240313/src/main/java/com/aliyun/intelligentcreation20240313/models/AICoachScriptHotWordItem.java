// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class AICoachScriptHotWordItem extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>849843</p>
     */
    @NameInMap("creatorId")
    public String creatorId;

    /**
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("creatorName")
    public String creatorName;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2026-11-13 12:01:12</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2026-11-13 12:01:12</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("hotWord")
    public String hotWord;

    /**
     * <strong>example:</strong>
     * <p>34532</p>
     */
    @NameInMap("hotWordId")
    public String hotWordId;

    /**
     * <strong>example:</strong>
     * <p>892340</p>
     */
    @NameInMap("modifierId")
    public String modifierId;

    /**
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("modifierName")
    public String modifierName;

    /**
     * <strong>example:</strong>
     * <p>8491340</p>
     */
    @NameInMap("scriptRecordId")
    public String scriptRecordId;

    public static AICoachScriptHotWordItem build(java.util.Map<String, ?> map) throws Exception {
        AICoachScriptHotWordItem self = new AICoachScriptHotWordItem();
        return TeaModel.build(map, self);
    }

    public AICoachScriptHotWordItem setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public AICoachScriptHotWordItem setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public AICoachScriptHotWordItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AICoachScriptHotWordItem setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AICoachScriptHotWordItem setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AICoachScriptHotWordItem setHotWord(String hotWord) {
        this.hotWord = hotWord;
        return this;
    }
    public String getHotWord() {
        return this.hotWord;
    }

    public AICoachScriptHotWordItem setHotWordId(String hotWordId) {
        this.hotWordId = hotWordId;
        return this;
    }
    public String getHotWordId() {
        return this.hotWordId;
    }

    public AICoachScriptHotWordItem setModifierId(String modifierId) {
        this.modifierId = modifierId;
        return this;
    }
    public String getModifierId() {
        return this.modifierId;
    }

    public AICoachScriptHotWordItem setModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }
    public String getModifierName() {
        return this.modifierName;
    }

    public AICoachScriptHotWordItem setScriptRecordId(String scriptRecordId) {
        this.scriptRecordId = scriptRecordId;
        return this;
    }
    public String getScriptRecordId() {
        return this.scriptRecordId;
    }

}
