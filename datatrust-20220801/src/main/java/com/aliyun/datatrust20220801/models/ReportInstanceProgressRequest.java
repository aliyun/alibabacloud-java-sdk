// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ReportInstanceProgressRequest extends TeaModel {
    @NameInMap("ProgressInfo")
    public java.util.List<ReportInstanceProgressRequestProgressInfo> progressInfo;

    public static ReportInstanceProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportInstanceProgressRequest self = new ReportInstanceProgressRequest();
        return TeaModel.build(map, self);
    }

    public ReportInstanceProgressRequest setProgressInfo(java.util.List<ReportInstanceProgressRequestProgressInfo> progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }
    public java.util.List<ReportInstanceProgressRequestProgressInfo> getProgressInfo() {
        return this.progressInfo;
    }

    public static class ReportInstanceProgressRequestProgressInfoGSONCalls extends TeaModel {
        @NameInMap("ThreadLocalHashCode")
        public Integer threadLocalHashCode;

        public static ReportInstanceProgressRequestProgressInfoGSONCalls build(java.util.Map<String, ?> map) throws Exception {
            ReportInstanceProgressRequestProgressInfoGSONCalls self = new ReportInstanceProgressRequestProgressInfoGSONCalls();
            return TeaModel.build(map, self);
        }

        public ReportInstanceProgressRequestProgressInfoGSONCalls setThreadLocalHashCode(Integer threadLocalHashCode) {
            this.threadLocalHashCode = threadLocalHashCode;
            return this;
        }
        public Integer getThreadLocalHashCode() {
            return this.threadLocalHashCode;
        }

    }

    public static class ReportInstanceProgressRequestProgressInfoGSONConstructorConstructor extends TeaModel {
        @NameInMap("Accessor")
        public java.util.Map<String, ?> accessor;

        @NameInMap("InstanceCreators")
        public java.util.Map<String, java.util.Map<String, ?>> instanceCreators;

        public static ReportInstanceProgressRequestProgressInfoGSONConstructorConstructor build(java.util.Map<String, ?> map) throws Exception {
            ReportInstanceProgressRequestProgressInfoGSONConstructorConstructor self = new ReportInstanceProgressRequestProgressInfoGSONConstructorConstructor();
            return TeaModel.build(map, self);
        }

        public ReportInstanceProgressRequestProgressInfoGSONConstructorConstructor setAccessor(java.util.Map<String, ?> accessor) {
            this.accessor = accessor;
            return this;
        }
        public java.util.Map<String, ?> getAccessor() {
            return this.accessor;
        }

        public ReportInstanceProgressRequestProgressInfoGSONConstructorConstructor setInstanceCreators(java.util.Map<String, java.util.Map<String, ?>> instanceCreators) {
            this.instanceCreators = instanceCreators;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getInstanceCreators() {
            return this.instanceCreators;
        }

    }

    public static class ReportInstanceProgressRequestProgressInfoGSONExcluder extends TeaModel {
        @NameInMap("DeserializationStrategies")
        public java.util.List<java.util.Map<String, ?>> deserializationStrategies;

        @NameInMap("Modifiers")
        public Integer modifiers;

        @NameInMap("RequireExpose")
        public Boolean requireExpose;

        @NameInMap("SerializationStrategies")
        public java.util.List<java.util.Map<String, ?>> serializationStrategies;

        @NameInMap("SerializeInnerClasses")
        public Boolean serializeInnerClasses;

        @NameInMap("Version")
        public Double version;

        public static ReportInstanceProgressRequestProgressInfoGSONExcluder build(java.util.Map<String, ?> map) throws Exception {
            ReportInstanceProgressRequestProgressInfoGSONExcluder self = new ReportInstanceProgressRequestProgressInfoGSONExcluder();
            return TeaModel.build(map, self);
        }

        public ReportInstanceProgressRequestProgressInfoGSONExcluder setDeserializationStrategies(java.util.List<java.util.Map<String, ?>> deserializationStrategies) {
            this.deserializationStrategies = deserializationStrategies;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getDeserializationStrategies() {
            return this.deserializationStrategies;
        }

        public ReportInstanceProgressRequestProgressInfoGSONExcluder setModifiers(Integer modifiers) {
            this.modifiers = modifiers;
            return this;
        }
        public Integer getModifiers() {
            return this.modifiers;
        }

        public ReportInstanceProgressRequestProgressInfoGSONExcluder setRequireExpose(Boolean requireExpose) {
            this.requireExpose = requireExpose;
            return this;
        }
        public Boolean getRequireExpose() {
            return this.requireExpose;
        }

        public ReportInstanceProgressRequestProgressInfoGSONExcluder setSerializationStrategies(java.util.List<java.util.Map<String, ?>> serializationStrategies) {
            this.serializationStrategies = serializationStrategies;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSerializationStrategies() {
            return this.serializationStrategies;
        }

        public ReportInstanceProgressRequestProgressInfoGSONExcluder setSerializeInnerClasses(Boolean serializeInnerClasses) {
            this.serializeInnerClasses = serializeInnerClasses;
            return this;
        }
        public Boolean getSerializeInnerClasses() {
            return this.serializeInnerClasses;
        }

        public ReportInstanceProgressRequestProgressInfoGSONExcluder setVersion(Double version) {
            this.version = version;
            return this;
        }
        public Double getVersion() {
            return this.version;
        }

    }

    public static class ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactoryConstructorConstructor extends TeaModel {
        @NameInMap("Accessor")
        public java.util.Map<String, ?> accessor;

        @NameInMap("InstanceCreators")
        public java.util.Map<String, java.util.Map<String, ?>> instanceCreators;

        public static ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactoryConstructorConstructor build(java.util.Map<String, ?> map) throws Exception {
            ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactoryConstructorConstructor self = new ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactoryConstructorConstructor();
            return TeaModel.build(map, self);
        }

        public ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactoryConstructorConstructor setAccessor(java.util.Map<String, ?> accessor) {
            this.accessor = accessor;
            return this;
        }
        public java.util.Map<String, ?> getAccessor() {
            return this.accessor;
        }

        public ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactoryConstructorConstructor setInstanceCreators(java.util.Map<String, java.util.Map<String, ?>> instanceCreators) {
            this.instanceCreators = instanceCreators;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getInstanceCreators() {
            return this.instanceCreators;
        }

    }

    public static class ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactory extends TeaModel {
        @NameInMap("ConstructorConstructor")
        public ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactoryConstructorConstructor constructorConstructor;

        public static ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactory build(java.util.Map<String, ?> map) throws Exception {
            ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactory self = new ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactory();
            return TeaModel.build(map, self);
        }

        public ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactory setConstructorConstructor(ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactoryConstructorConstructor constructorConstructor) {
            this.constructorConstructor = constructorConstructor;
            return this;
        }
        public ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactoryConstructorConstructor getConstructorConstructor() {
            return this.constructorConstructor;
        }

    }

    public static class ReportInstanceProgressRequestProgressInfoGSON extends TeaModel {
        @NameInMap("BuilderFactories")
        public java.util.List<java.util.Map<String, ?>> builderFactories;

        @NameInMap("BuilderHierarchyFactories")
        public java.util.List<java.util.Map<String, ?>> builderHierarchyFactories;

        @NameInMap("Calls")
        public ReportInstanceProgressRequestProgressInfoGSONCalls calls;

        @NameInMap("ComplexMapKeySerialization")
        public Boolean complexMapKeySerialization;

        @NameInMap("ConstructorConstructor")
        public ReportInstanceProgressRequestProgressInfoGSONConstructorConstructor constructorConstructor;

        @NameInMap("DatePattern")
        public String datePattern;

        @NameInMap("DateStyle")
        public Integer dateStyle;

        @NameInMap("Excluder")
        public ReportInstanceProgressRequestProgressInfoGSONExcluder excluder;

        @NameInMap("Factories")
        public java.util.List<java.util.Map<String, ?>> factories;

        @NameInMap("FieldNamingStrategy")
        public java.util.Map<String, ?> fieldNamingStrategy;

        @NameInMap("GenerateNonExecutableJson")
        public Boolean generateNonExecutableJson;

        @NameInMap("HtmlSafe")
        public Boolean htmlSafe;

        @NameInMap("InstanceCreators")
        public java.util.Map<String, java.util.Map<String, ?>> instanceCreators;

        @NameInMap("JsonAdapterFactory")
        public ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactory jsonAdapterFactory;

        @NameInMap("Lenient")
        public Boolean lenient;

        @NameInMap("LongSerializationPolicy")
        public String longSerializationPolicy;

        @NameInMap("PrettyPrinting")
        public Boolean prettyPrinting;

        @NameInMap("SerializeNulls")
        public Boolean serializeNulls;

        @NameInMap("SerializeSpecialFloatingPointValues")
        public Boolean serializeSpecialFloatingPointValues;

        @NameInMap("TimeStyle")
        public Integer timeStyle;

        @NameInMap("TypeTokenCache")
        public java.util.Map<String, java.util.Map<String, ?>> typeTokenCache;

        public static ReportInstanceProgressRequestProgressInfoGSON build(java.util.Map<String, ?> map) throws Exception {
            ReportInstanceProgressRequestProgressInfoGSON self = new ReportInstanceProgressRequestProgressInfoGSON();
            return TeaModel.build(map, self);
        }

        public ReportInstanceProgressRequestProgressInfoGSON setBuilderFactories(java.util.List<java.util.Map<String, ?>> builderFactories) {
            this.builderFactories = builderFactories;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getBuilderFactories() {
            return this.builderFactories;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setBuilderHierarchyFactories(java.util.List<java.util.Map<String, ?>> builderHierarchyFactories) {
            this.builderHierarchyFactories = builderHierarchyFactories;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getBuilderHierarchyFactories() {
            return this.builderHierarchyFactories;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setCalls(ReportInstanceProgressRequestProgressInfoGSONCalls calls) {
            this.calls = calls;
            return this;
        }
        public ReportInstanceProgressRequestProgressInfoGSONCalls getCalls() {
            return this.calls;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setComplexMapKeySerialization(Boolean complexMapKeySerialization) {
            this.complexMapKeySerialization = complexMapKeySerialization;
            return this;
        }
        public Boolean getComplexMapKeySerialization() {
            return this.complexMapKeySerialization;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setConstructorConstructor(ReportInstanceProgressRequestProgressInfoGSONConstructorConstructor constructorConstructor) {
            this.constructorConstructor = constructorConstructor;
            return this;
        }
        public ReportInstanceProgressRequestProgressInfoGSONConstructorConstructor getConstructorConstructor() {
            return this.constructorConstructor;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setDatePattern(String datePattern) {
            this.datePattern = datePattern;
            return this;
        }
        public String getDatePattern() {
            return this.datePattern;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setDateStyle(Integer dateStyle) {
            this.dateStyle = dateStyle;
            return this;
        }
        public Integer getDateStyle() {
            return this.dateStyle;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setExcluder(ReportInstanceProgressRequestProgressInfoGSONExcluder excluder) {
            this.excluder = excluder;
            return this;
        }
        public ReportInstanceProgressRequestProgressInfoGSONExcluder getExcluder() {
            return this.excluder;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setFactories(java.util.List<java.util.Map<String, ?>> factories) {
            this.factories = factories;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getFactories() {
            return this.factories;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setFieldNamingStrategy(java.util.Map<String, ?> fieldNamingStrategy) {
            this.fieldNamingStrategy = fieldNamingStrategy;
            return this;
        }
        public java.util.Map<String, ?> getFieldNamingStrategy() {
            return this.fieldNamingStrategy;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setGenerateNonExecutableJson(Boolean generateNonExecutableJson) {
            this.generateNonExecutableJson = generateNonExecutableJson;
            return this;
        }
        public Boolean getGenerateNonExecutableJson() {
            return this.generateNonExecutableJson;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setHtmlSafe(Boolean htmlSafe) {
            this.htmlSafe = htmlSafe;
            return this;
        }
        public Boolean getHtmlSafe() {
            return this.htmlSafe;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setInstanceCreators(java.util.Map<String, java.util.Map<String, ?>> instanceCreators) {
            this.instanceCreators = instanceCreators;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getInstanceCreators() {
            return this.instanceCreators;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setJsonAdapterFactory(ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactory jsonAdapterFactory) {
            this.jsonAdapterFactory = jsonAdapterFactory;
            return this;
        }
        public ReportInstanceProgressRequestProgressInfoGSONJsonAdapterFactory getJsonAdapterFactory() {
            return this.jsonAdapterFactory;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setLenient(Boolean lenient) {
            this.lenient = lenient;
            return this;
        }
        public Boolean getLenient() {
            return this.lenient;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setLongSerializationPolicy(String longSerializationPolicy) {
            this.longSerializationPolicy = longSerializationPolicy;
            return this;
        }
        public String getLongSerializationPolicy() {
            return this.longSerializationPolicy;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setPrettyPrinting(Boolean prettyPrinting) {
            this.prettyPrinting = prettyPrinting;
            return this;
        }
        public Boolean getPrettyPrinting() {
            return this.prettyPrinting;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setSerializeNulls(Boolean serializeNulls) {
            this.serializeNulls = serializeNulls;
            return this;
        }
        public Boolean getSerializeNulls() {
            return this.serializeNulls;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setSerializeSpecialFloatingPointValues(Boolean serializeSpecialFloatingPointValues) {
            this.serializeSpecialFloatingPointValues = serializeSpecialFloatingPointValues;
            return this;
        }
        public Boolean getSerializeSpecialFloatingPointValues() {
            return this.serializeSpecialFloatingPointValues;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setTimeStyle(Integer timeStyle) {
            this.timeStyle = timeStyle;
            return this;
        }
        public Integer getTimeStyle() {
            return this.timeStyle;
        }

        public ReportInstanceProgressRequestProgressInfoGSON setTypeTokenCache(java.util.Map<String, java.util.Map<String, ?>> typeTokenCache) {
            this.typeTokenCache = typeTokenCache;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getTypeTokenCache() {
            return this.typeTokenCache;
        }

    }

    public static class ReportInstanceProgressRequestProgressInfo extends TeaModel {
        @NameInMap("DEFAULT_LEVEL")
        public String DEFAULT_LEVEL;

        @NameInMap("GSON")
        public ReportInstanceProgressRequestProgressInfoGSON GSON;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("InstanceMsg")
        public String instanceMsg;

        @NameInMap("InstanceResult")
        public String instanceResult;

        @NameInMap("InstanceStatus")
        public Integer instanceStatus;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("PARTY_NAME")
        public String PARTY_NAME;

        @NameInMap("PartnerName")
        public String partnerName;

        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("Progress")
        public Double progress;

        @NameInMap("StageProgress")
        public String stageProgress;

        @NameInMap("TaskProgress")
        public String taskProgress;

        public static ReportInstanceProgressRequestProgressInfo build(java.util.Map<String, ?> map) throws Exception {
            ReportInstanceProgressRequestProgressInfo self = new ReportInstanceProgressRequestProgressInfo();
            return TeaModel.build(map, self);
        }

        public ReportInstanceProgressRequestProgressInfo setDEFAULT_LEVEL(String DEFAULT_LEVEL) {
            this.DEFAULT_LEVEL = DEFAULT_LEVEL;
            return this;
        }
        public String getDEFAULT_LEVEL() {
            return this.DEFAULT_LEVEL;
        }

        public ReportInstanceProgressRequestProgressInfo setGSON(ReportInstanceProgressRequestProgressInfoGSON GSON) {
            this.GSON = GSON;
            return this;
        }
        public ReportInstanceProgressRequestProgressInfoGSON getGSON() {
            return this.GSON;
        }

        public ReportInstanceProgressRequestProgressInfo setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ReportInstanceProgressRequestProgressInfo setInstanceMsg(String instanceMsg) {
            this.instanceMsg = instanceMsg;
            return this;
        }
        public String getInstanceMsg() {
            return this.instanceMsg;
        }

        public ReportInstanceProgressRequestProgressInfo setInstanceResult(String instanceResult) {
            this.instanceResult = instanceResult;
            return this;
        }
        public String getInstanceResult() {
            return this.instanceResult;
        }

        public ReportInstanceProgressRequestProgressInfo setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public ReportInstanceProgressRequestProgressInfo setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ReportInstanceProgressRequestProgressInfo setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ReportInstanceProgressRequestProgressInfo setPARTY_NAME(String PARTY_NAME) {
            this.PARTY_NAME = PARTY_NAME;
            return this;
        }
        public String getPARTY_NAME() {
            return this.PARTY_NAME;
        }

        public ReportInstanceProgressRequestProgressInfo setPartnerName(String partnerName) {
            this.partnerName = partnerName;
            return this;
        }
        public String getPartnerName() {
            return this.partnerName;
        }

        public ReportInstanceProgressRequestProgressInfo setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public ReportInstanceProgressRequestProgressInfo setProgress(Double progress) {
            this.progress = progress;
            return this;
        }
        public Double getProgress() {
            return this.progress;
        }

        public ReportInstanceProgressRequestProgressInfo setStageProgress(String stageProgress) {
            this.stageProgress = stageProgress;
            return this;
        }
        public String getStageProgress() {
            return this.stageProgress;
        }

        public ReportInstanceProgressRequestProgressInfo setTaskProgress(String taskProgress) {
            this.taskProgress = taskProgress;
            return this;
        }
        public String getTaskProgress() {
            return this.taskProgress;
        }

    }

}
