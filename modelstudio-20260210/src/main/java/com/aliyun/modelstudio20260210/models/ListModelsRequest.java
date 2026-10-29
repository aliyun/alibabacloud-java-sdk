// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListModelsRequest extends TeaModel {
    /**
     * <p>The model type. Valid values:</p>
     * <ul>
     * <li>Reasoning: Deep thinking.</li>
     * <li>VU: Visual understanding.</li>
     * <li>IG: Image generation.</li>
     * <li>VG: Video generation.</li>
     * <li>ASR: Speech recognition.</li>
     * <li>TTS: Speech synthesis.</li>
     * <li>ME: Multimodal embedding.</li>
     * <li>Realtime-Omni: Real-time omni-modal.</li>
     * <li>Multimodal-Omni: Omni-modal.</li>
     * <li>Realtime-Text-to-Speech: Real-time speech synthesis.</li>
     * <li>TG: Text generation.</li>
     * <li>TR: Text embedding.</li>
     * <li>Realtime-ASR: Real-time speech recognition.</li>
     * <li>Realtime-Audio-Translate: Real-time audio translation.</li>
     * <li>3D-generation: 3D generation.</li>
     * <li>Realtime-Chatting: Real-time voice conversation.</li>
     * </ul>
     */
    @NameInMap("capabilities")
    public java.util.List<String> capabilities;

    /**
     * <p>The context window size used to filter models with a context window smaller than this value.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("contextWindow")
    public Long contextWindow;

    /**
     * <p>The model capability. Valid values:</p>
     * <ul>
     * <li>model-experience: Playground.</li>
     * <li>function-calling: Function calling.</li>
     * <li>structured-outputs: Structured output.</li>
     * <li>web-search: Web search.</li>
     * <li>prefix-completion: Partial mode.</li>
     * <li>cache: Cache.</li>
     * <li>batch: Batch inference.</li>
     * <li>fine-tuning: Model fine-tuning.</li>
     * </ul>
     */
    @NameInMap("features")
    public java.util.List<String> features;

    /**
     * <p>The language. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese.</li>
     * <li>en-US: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>The maximum number of results to return. Valid values: 0 to 200.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The model name for exact match.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>The model name for fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The next token.</p>
     * 
     * <strong>example:</strong>
     * <p>lwytFRtLdNk=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The provider. Valid values:</p>
     * <ul>
     * <li>qwen: Alibaba Cloud - Qwen.</li>
     * <li>zhipu-ai: Zhipu AI.</li>
     * <li>wan: Alibaba Cloud - Wan.</li>
     * <li>qwen-domain-model: Alibaba Cloud - Domain Model.</li>
     * <li>mini-max: MiniMax.</li>
     * <li>moonshot-ai: Moonshot AI.</li>
     * <li>deepseek: DeepSeek.</li>
     * <li>happyhorse: Alibaba Cloud - HappyHorse.</li>
     * <li>kling: Kling AI.</li>
     * <li>pixverse: PixVerse.</li>
     * <li>vidu: Vidu.</li>
     * <li>tripo: Tripo.</li>
     * <li>xiaomi: Xiaomi MiMo.</li>
     * </ul>
     */
    @NameInMap("providers")
    public java.util.List<String> providers;

    public static ListModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelsRequest self = new ListModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelsRequest setCapabilities(java.util.List<String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public java.util.List<String> getCapabilities() {
        return this.capabilities;
    }

    public ListModelsRequest setContextWindow(Long contextWindow) {
        this.contextWindow = contextWindow;
        return this;
    }
    public Long getContextWindow() {
        return this.contextWindow;
    }

    public ListModelsRequest setFeatures(java.util.List<String> features) {
        this.features = features;
        return this;
    }
    public java.util.List<String> getFeatures() {
        return this.features;
    }

    public ListModelsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListModelsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListModelsRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ListModelsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListModelsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelsRequest setProviders(java.util.List<String> providers) {
        this.providers = providers;
        return this;
    }
    public java.util.List<String> getProviders() {
        return this.providers;
    }

}
