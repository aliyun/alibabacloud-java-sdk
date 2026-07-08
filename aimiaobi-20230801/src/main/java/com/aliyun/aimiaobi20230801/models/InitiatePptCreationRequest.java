// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InitiatePptCreationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("ExternalUserId")
    public String externalUserId;

    /**
     * <p>The outline.</p>
     * 
     * <strong>example:</strong>
     * <h1>中国传统文化艺术的魅力</h1>
     * <h2>1. 传统文化艺术的源远流长</h2>
     * <h3>1.1 中国古代艺术发展历程</h3>
     * <h4>1.1.1 古代绘画艺术的演变</h4>
     * <ul>
     * <li>从新石器时代的彩陶绘画到东汉时期帛画的出现，绘画形式不断丰富，展现了古人对美的独特追求。唐代绘画风格多样，吴道子的《送子天王图》线条流畅，色彩绚丽，体现了唐代绘画的高超技艺。</li>
     * </ul>
     * <h4>1.1.2 书法艺术的传承与创新</h4>
     * <ul>
     * <li>书法从甲骨文到楷书、行书、草书，历经数千年演变，承载着中华文化的深厚内涵。王羲之的《兰亭序》被誉为“天下第一行书”，其笔法精妙，结构严谨，展现了书法艺术的巅峰。</li>
     * </ul>
     */
    @NameInMap("Outline")
    public String outline;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95c2fbe6-5a20-4fc2-8a93-376ed05fbe13</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The unique ID of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Obtain a workspace ID</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-3fy94b2rtadt01qa</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static InitiatePptCreationRequest build(java.util.Map<String, ?> map) throws Exception {
        InitiatePptCreationRequest self = new InitiatePptCreationRequest();
        return TeaModel.build(map, self);
    }

    public InitiatePptCreationRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public InitiatePptCreationRequest setOutline(String outline) {
        this.outline = outline;
        return this;
    }
    public String getOutline() {
        return this.outline;
    }

    public InitiatePptCreationRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public InitiatePptCreationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
