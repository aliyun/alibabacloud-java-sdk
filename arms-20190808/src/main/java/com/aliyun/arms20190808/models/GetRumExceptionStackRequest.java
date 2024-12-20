// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumExceptionStackRequest extends TeaModel {
    /**
     * <p>The binary images, which represent all executable files loaded into the process address space when a crash occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>iOSDemo:arm64%3B1489F4D3-6DE2-300C-90E9-E1B869675351%3B0x0000000104064000\nAlibabaCloudRUM:arm64%3BAB7B3A8E-6CEE-325D-BCBB-8DA50E61804F%3B0x0000000106660000\nlibdispatch.dylib:arm</p>
     */
    @NameInMap("ExceptionBinaryImages")
    public String exceptionBinaryImages;

    /**
     * <p>The exception stack information. Set the value to a JSON string. call_stack.info represents the stack information, call_stack.thread.name represents the thread name, and call_stack.thread.id represents the thread ID. This parameter is exactly the same as the exception.stack parameter in the logstore-rum Logstore of Simple Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     * {
     *     &quot;call_stack.info&quot;: &quot;libsystem_kernel.dylib  0x00000001f1ce9178 0x00000001f1ce8000 + 4472\r\nlibsystem_kernel.dylib  0x00000001f1ce8f10 0x00000001f1ce8000 + 3856\r\nlibsystem_kernel.dylib  0x00000001f1ced718 0x00000001f1ce8000 + 22296\r\nAlibabaCloudRUM  0x0000000106711af4 0x0000000106660000 + 727796\r\nlibsystem_pthread.dylib  0x00000002146744d4 0x0000000214672000 + 9428&quot;,
     *     &quot;call_stack.thread.name&quot;: &quot;#3 BRSCrash Exception Handler (Secondary)&quot;,
     *     &quot;call_stack.thread.id&quot;: &quot;16643&quot;
     *   }
     * ]</p>
     */
    @NameInMap("ExceptionStack")
    public String exceptionStack;

    /**
     * <p>The ID of the exception thread.</p>
     * 
     * <strong>example:</strong>
     * <p>16643</p>
     */
    @NameInMap("ExceptionThreadId")
    public String exceptionThreadId;

    @NameInMap("ExtraInfo")
    public String extraInfo;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>atxxxxzkcf@d8deedfa9bf****</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The file type. Valid values:</p>
     * <ul>
     * <li>source-map: SourceMap files</li>
     * <li>mapping: symbol table files for Android</li>
     * <li>dsym: dSYM files for iOS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>source-map</p>
     */
    @NameInMap("SourcemapType")
    public String sourcemapType;

    public static GetRumExceptionStackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRumExceptionStackRequest self = new GetRumExceptionStackRequest();
        return TeaModel.build(map, self);
    }

    public GetRumExceptionStackRequest setExceptionBinaryImages(String exceptionBinaryImages) {
        this.exceptionBinaryImages = exceptionBinaryImages;
        return this;
    }
    public String getExceptionBinaryImages() {
        return this.exceptionBinaryImages;
    }

    public GetRumExceptionStackRequest setExceptionStack(String exceptionStack) {
        this.exceptionStack = exceptionStack;
        return this;
    }
    public String getExceptionStack() {
        return this.exceptionStack;
    }

    public GetRumExceptionStackRequest setExceptionThreadId(String exceptionThreadId) {
        this.exceptionThreadId = exceptionThreadId;
        return this;
    }
    public String getExceptionThreadId() {
        return this.exceptionThreadId;
    }

    public GetRumExceptionStackRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public GetRumExceptionStackRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetRumExceptionStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRumExceptionStackRequest setSourcemapType(String sourcemapType) {
        this.sourcemapType = sourcemapType;
        return this;
    }
    public String getSourcemapType() {
        return this.sourcemapType;
    }

}
