// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    /**
     * <p>Details about applications.</p>
     */
    @NameInMap("Applications")
    public ListApplicationsResponseBodyApplications applications;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>50373E71-7710-4620-8AAB-133CCE49451C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponseBody self = new ListApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponseBody setApplications(ListApplicationsResponseBodyApplications applications) {
        this.applications = applications;
        return this;
    }
    public ListApplicationsResponseBodyApplications getApplications() {
        return this.applications;
    }

    public ListApplicationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationsResponseBodyApplicationsApplicationAppListApp extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>e76f8985-7965-41fc-925b-9648bb6bf650</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The information about the application, such as the resource specification, parameter configuration, and resources.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;AppStatus&quot;:{
         *         &quot;Phase&quot;:&quot;RUNNING&quot;,
         *         &quot;StatusDescrip&quot;:&quot;{\&quot;status\&quot;:\&quot;UPDATE_SUCCESS\&quot;,\&quot;step\&quot;:\&quot;DONE\&quot;,\&quot;descrip\&quot;:\&quot;update to version:1022 success\&quot;,\&quot;start_time\&quot;:\&quot;2022-03-01 16:18:22\&quot;}&quot;,
         *         &quot;UpdateTime&quot;:&quot;2022-03-01 16:18:22&quot;,
         *         &quot;OrderStatus&quot;:null
         *     },
         *     &quot;ResourceAttribute&quot;:{
         *         &quot;NetSecurityInfo&quot;:null,
         *         &quot;InitConfig&quot;:null,
         *         &quot;InventoryType&quot;:&quot;Ens&quot;,
         *         &quot;InstanceSpec&quot;:&quot;ens.gi6s-c12g1.large&quot;,
         *         &quot;SystemDiskSize&quot;:100,
         *         &quot;DataDiskSize&quot;:0,
         *         &quot;BandwithOut&quot;:5000,
         *         &quot;SchedulingStrategy&quot;:&quot;Disperse&quot;,
         *         &quot;ImageId&quot;:&quot;m-5or73kzkuxytv7hh6wxr6yc5q&quot;,
         *         &quot;ResourceType&quot;:&quot;Linux&quot;,
         *         &quot;AreaLevel&quot;:&quot;National&quot;,
         *         &quot;IpType&quot;:&quot;PublicIP&quot;
         *     },
         *     &quot;WorkloadAttribute&quot;:[
         *         {
         *             &quot;Name&quot;:&quot;andorid&quot;,
         *             &quot;Count&quot;:15,
         *             &quot;ServiceConfig&quot;:{
         *                 &quot;PortsBindConfig&quot;:{
         *                     &quot;NetServiceContainer&quot;:&quot;uravi-service&quot;,
         *                     &quot;Ports&quot;:[
         *                         {
         *                             &quot;Protocol&quot;:&quot;TCP&quot;,
         *                             &quot;BindType&quot;:&quot;Mapping&quot;,
         *                             &quot;StartNodePorts&quot;:&quot;31000-31009&quot;,
         *                             &quot;ContainerPorts&quot;:&quot;4440-4449&quot;
         *                         },
         *                         {
         *                             &quot;Protocol&quot;:&quot;TCP&quot;,
         *                             &quot;BindType&quot;:&quot;PassThrough&quot;,
         *                             &quot;StartNodePorts&quot;:&quot;59000-59000&quot;,
         *                             &quot;ContainerPorts&quot;:&quot;59000-59000&quot;
         *                         },
         *                         {
         *                             &quot;Protocol&quot;:&quot;UDP&quot;,
         *                             &quot;BindType&quot;:&quot;PassThrough&quot;,
         *                             &quot;StartNodePorts&quot;:&quot;40001-40010&quot;,
         *                             &quot;ContainerPorts&quot;:&quot;40001-40010&quot;
         *                         }
         *                     ]
         *                 },
         *                 &quot;ServiceContainerName&quot;:&quot;android&quot;
         *             }
         *         },
         *         {
         *             &quot;Name&quot;:&quot;coturn&quot;,
         *             &quot;Count&quot;:1,
         *             &quot;ServiceConfig&quot;:{
         *                 &quot;PortsBindConfig&quot;:{
         *                     &quot;NetServiceContainer&quot;:&quot;coturn&quot;,
         *                     &quot;Ports&quot;:[
         *                         {
         *                             &quot;Protocol&quot;:&quot;TCP&quot;,
         *                             &quot;BindType&quot;:&quot;PassThrough&quot;,
         *                             &quot;StartNodePorts&quot;:&quot;3478-3478&quot;,
         *                             &quot;ContainerPorts&quot;:&quot;3478-3478&quot;
         *                         },
         *                         {
         *                             &quot;Protocol&quot;:&quot;UDP&quot;,
         *                             &quot;BindType&quot;:&quot;PassThrough&quot;,
         *                             &quot;StartNodePorts&quot;:&quot;3478-3478&quot;,
         *                             &quot;ContainerPorts&quot;:&quot;3478-3478&quot;
         *                         }
         *                     ]
         *                 },
         *                 &quot;ServiceContainerName&quot;:&quot;coturn&quot;
         *             }
         *         },
         *         {
         *             &quot;Name&quot;:&quot;aic-manager&quot;,
         *             &quot;Count&quot;:1,
         *             &quot;ServiceConfig&quot;:null
         *         }
         *     ]
         * }</p>
         */
        @NameInMap("AppInfo")
        public String appInfo;

        public static ListApplicationsResponseBodyApplicationsApplicationAppListApp build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplicationsApplicationAppListApp self = new ListApplicationsResponseBodyApplicationsApplicationAppListApp();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplicationsApplicationAppListApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationsResponseBodyApplicationsApplicationAppListApp setAppInfo(String appInfo) {
            this.appInfo = appInfo;
            return this;
        }
        public String getAppInfo() {
            return this.appInfo;
        }

    }

    public static class ListApplicationsResponseBodyApplicationsApplicationAppList extends TeaModel {
        @NameInMap("App")
        public java.util.List<ListApplicationsResponseBodyApplicationsApplicationAppListApp> app;

        public static ListApplicationsResponseBodyApplicationsApplicationAppList build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplicationsApplicationAppList self = new ListApplicationsResponseBodyApplicationsApplicationAppList();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplicationsApplicationAppList setApp(java.util.List<ListApplicationsResponseBodyApplicationsApplicationAppListApp> app) {
            this.app = app;
            return this;
        }
        public java.util.List<ListApplicationsResponseBodyApplicationsApplicationAppListApp> getApp() {
            return this.app;
        }

    }

    public static class ListApplicationsResponseBodyApplicationsApplication extends TeaModel {
        /**
         * <p>Details about the application.</p>
         */
        @NameInMap("AppList")
        public ListApplicationsResponseBodyApplicationsApplicationAppList appList;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ay-ads-hz-h</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        public static ListApplicationsResponseBodyApplicationsApplication build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplicationsApplication self = new ListApplicationsResponseBodyApplicationsApplication();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplicationsApplication setAppList(ListApplicationsResponseBodyApplicationsApplicationAppList appList) {
            this.appList = appList;
            return this;
        }
        public ListApplicationsResponseBodyApplicationsApplicationAppList getAppList() {
            return this.appList;
        }

        public ListApplicationsResponseBodyApplicationsApplication setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

    }

    public static class ListApplicationsResponseBodyApplications extends TeaModel {
        @NameInMap("Application")
        public java.util.List<ListApplicationsResponseBodyApplicationsApplication> application;

        public static ListApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplications self = new ListApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplications setApplication(java.util.List<ListApplicationsResponseBodyApplicationsApplication> application) {
            this.application = application;
            return this;
        }
        public java.util.List<ListApplicationsResponseBodyApplicationsApplication> getApplication() {
            return this.application;
        }

    }

}
